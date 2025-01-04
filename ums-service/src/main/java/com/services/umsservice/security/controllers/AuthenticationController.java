package com.services.umsservice.security.controllers;

import com.services.umsservice.entities.User;
import com.services.umsservice.security.services.IServiceAuth;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/registration/")
public class AuthenticationController {

    private final IServiceAuth iServiceAuth;

    @PostMapping("user")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        User newUser = iServiceAuth.createUser(user);
        if (newUser != null)
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("User exists with username " + user.getUsername(), HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping("roletouser")
    public ResponseEntity<Object> addRoleToUser(@RequestParam String username, @RequestParam String role) {
        if (iServiceAuth.addRoleToUser(username, role)) {
            return new ResponseEntity<>("Role " + role + " assigned to " + username, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Unable to assign role " + role + " to " + username, HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
