package com.services.umsservice.security.services;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.services.umsservice.security.entities.AppUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IServiceAuth iServiceAuth;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser= iServiceAuth.LoadUserByUserName(username);
        if(appUser==null) throw new UsernameNotFoundException("User with " + username + " does not exist");
        String[] roles = appUser.getRoles().stream().map(u -> u.getRole()).toArray(String[]::new);

        return User
                .withUsername(appUser.getUsername())
                .password(appUser.getPassword())
                .roles(roles)
                .build();
    }
}
