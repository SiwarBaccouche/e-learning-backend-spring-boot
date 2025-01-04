package com.services.umsservice.security.services;


import com.services.umsservice.entities.Admin;
import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.entities.User;
import com.services.umsservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceAuth implements IServiceAuth {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public User createUser(User user) {
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser == null) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public boolean addRoleToUser(String username, String role) {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            if (role.equals("PARENT") && user instanceof Parent) {
                user.setRole("Parent");
            } else if (role.equals("KID") && user instanceof Kid) {
                user.setRole("Kid");
            } else if (role.equals("ADMIN") && user instanceof Admin) {
                user.setRole("Admin");
            }
            userRepository.save(user);
            return true;
        }
        return false;
    }


    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}