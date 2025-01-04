package com.services.umsservice.services;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.repositories.KidRepository;
import com.services.umsservice.repositories.ParentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceParent implements IServiceParent{
    private final ParentRepository parentRepository;
    private final KidRepository kidRepository;

    @Override
    public List<Kid> getKids(Long parentId) {
        Parent parent = parentRepository.findById(parentId).orElseThrow(() -> new RuntimeException("Parent not found"));
        return parent.getKids();
    }

    @Override
    public Kid addKid(Long parentId, Kid kid) {
        Parent parent = parentRepository.findById(parentId).orElseThrow(() -> new RuntimeException("Parent not found"));
        parent.getKids().add(kid);
        parentRepository.save(parent);
        return kid;
    }

    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }
}