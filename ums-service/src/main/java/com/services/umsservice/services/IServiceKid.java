package com.services.umsservice.services;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;

import java.util.List;

public interface IServiceKid {
    List<Parent> getParent(Long kidId);
    List<Kid> getAllKids();

}
