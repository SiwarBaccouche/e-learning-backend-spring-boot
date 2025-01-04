package com.services.umsservice.services;


import com.services.umsservice.entities.Admin;
import com.services.umsservice.repositories.AdminRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ServiceAdmin implements IServiceAdmin {
    private final AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}