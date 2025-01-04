package com.services.umsservice.security.services;


import com.services.umsservice.security.entities.AppRole;
import com.services.umsservice.security.entities.AppUser;
import com.services.umsservice.security.repositories.AppRoleRepository;
import com.services.umsservice.security.repositories.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceAuth implements IServiceAuth{

    private final AppUserRepository appUserRepository;
    private final AppRoleRepository appRoleRepository;
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public AppUser createAppUser(AppUser appUser) {
        AppUser appUser1 = appUserRepository.findByUsername(appUser.getUsername());
        if (appUser1==null) {
            appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
            return appUserRepository.save(appUser);
        }
        else
            return null;
    }

    @Override
    public AppRole createAppRole(AppRole appRole) {
        AppRole appRole1 = appRoleRepository.findByRole(appRole.getRole());
        if(appRole1==null)
            return appRoleRepository.save(appRole);
        else
            return null;
    }

    @Override
    public Boolean addRoleToUser(String username, String role) {
        AppUser appUser = appUserRepository.findByUsername(username);
        AppRole appRole = appRoleRepository.findByRole(role);
        if(!appUser.getRoles().contains(appRole) && appUser!=null && appRole!=null){
            appUser.getRoles().add(appRole);
            appUserRepository.save(appUser);
            return true;
        }
        else return false;
    }

    @Override
    public AppUser LoadUserByUserName(String username) {
        return appUserRepository.findByUsername(username);
    }
}
