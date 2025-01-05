package com.services.umsservice.services;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.repositories.KidRepository;
import com.services.umsservice.repositories.ParentRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceParent implements IServiceParent {
    private final ParentRepository parentRepository;
    private final KidRepository kidRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<Kid> getKids(Long parentId) {
        Parent parent = parentRepository.findById(parentId).orElseThrow(() -> new RuntimeException("Parent not found"));
        return parent.getKids();
    }

    @Override
    public Kid addKid(Long parentId, Kid kid) {
        Parent parent = parentRepository.findById(parentId)
                .orElseThrow(() -> new RuntimeException("Parent not found"));

        if (kid.getPassword() != null) {
            kid.setPassword(passwordEncoder.encode(kid.getPassword()));
        }
        Kid savedKid = kidRepository.save(kid);

        parent.getKids().add(savedKid);
        savedKid.getParents().add(parent);

        parentRepository.save(parent);

        return savedKid;
    }


    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }
}
