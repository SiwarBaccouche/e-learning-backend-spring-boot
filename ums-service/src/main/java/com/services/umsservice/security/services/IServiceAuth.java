package com.services.umsservice.security.services;

import com.services.umsservice.entities.Parent;
import com.services.umsservice.entities.User;

public interface IServiceAuth {
    Parent createUser(Parent parent);
    User loadUserByUsername(String username);
}
