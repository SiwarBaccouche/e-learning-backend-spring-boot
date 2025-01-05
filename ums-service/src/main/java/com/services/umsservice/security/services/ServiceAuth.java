package com.services.umsservice.security.services;


import com.services.umsservice.entities.Admin;
import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.entities.User;
import com.services.umsservice.repositories.ParentRepository;
import com.services.umsservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceAuth implements IServiceAuth {

    private final UserRepository userRepository;
    private final ParentRepository parentRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public Parent createUser(Parent parent) {
        User existingUser = userRepository.findByUsername(parent.getUsername());
        if (existingUser == null) {
            parent.setPassword(passwordEncoder.encode(parent.getPassword()));
            return parentRepository.save(parent);
        }
        return null;
    }

    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
