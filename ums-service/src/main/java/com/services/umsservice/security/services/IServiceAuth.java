package com.services.umsservice.security.services;

import com.services.umsservice.entities.User;

public interface IServiceAuth {
    User createUser(User user);
    boolean addRoleToUser(String username, String role);
    User loadUserByUsername(String username);
}
