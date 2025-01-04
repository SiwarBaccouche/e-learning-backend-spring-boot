package com.services.umsservice.security.repositories;

import com.services.umsservice.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Integer> {
    AppRole findByRole(String role);
}
