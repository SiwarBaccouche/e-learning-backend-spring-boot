package com.services.umsservice.security.controllers;


import com.services.umsservice.security.entities.AppRole;
import com.services.umsservice.security.entities.AppUser;
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

    @PostMapping("appuser")
    public ResponseEntity<Object> adduser(@RequestBody AppUser appUser){
        AppUser appUser1 = iServiceAuth.createAppUser(appUser);
        if(appUser1!=null)
            return new ResponseEntity<>(appUser1, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("User exit with username "+ appUser.getUsername(),HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping("approle")

    public ResponseEntity<Object> addrole(@RequestBody AppRole appRole){

        AppRole appRole1= iServiceAuth.createAppRole(appRole);
        if(appRole1!=null)
            return new ResponseEntity<>(appRole1, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Role" + appRole.getRole() + " exists",HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping ("roletouser")

    public ResponseEntity<String> addRoleToUser(@RequestParam String username, @RequestParam String role){
        if(iServiceAuth.addRoleToUser(username,role))
            return new ResponseEntity<>("Role " + role + " affected to " + username, HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Role still affected " + role, HttpStatus.NOT_ACCEPTABLE);
    }
}
