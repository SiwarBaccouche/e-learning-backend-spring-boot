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
public class ServiceKid implements IServiceKid {
    private final KidRepository kidRepository;

    @Override
    public Parent getParent(Long kidId) {
        Kid kid = kidRepository.findById(kidId).orElseThrow(() -> new RuntimeException("Kid not found"));
        return kid.getParent();
    }
}