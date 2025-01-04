package com.services.umsservice.security.services;

import com.services.umsservice.security.entities.AppRole;
import com.services.umsservice.security.entities.AppUser;

public interface IServiceAuth {
    public AppUser createAppUser(AppUser appUser);
    public AppRole createAppRole(AppRole appRole);
    public Boolean addRoleToUser(String username, String role);
    public AppUser LoadUserByUserName(String username);
}
