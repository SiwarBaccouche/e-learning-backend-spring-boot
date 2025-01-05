package com.services.umsservice.security.services;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.repositories.AdminRepository;
import com.services.umsservice.repositories.KidRepository;
import com.services.umsservice.repositories.ParentRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IServiceAuth iServiceAuth;
    private final ParentRepository parentRepository;
    private final KidRepository kidRepository;
    private final AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.services.umsservice.entities.User user = iServiceAuth.loadUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User with username " + username + " not found");
        }



        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .build();
    }
}
