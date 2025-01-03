package com.services.umsservice.services;

import com.services.umsservice.entities.Kid;

import java.util.List;

public interface IServiceParent {
    List<Kid> getKids(Long parentId);
    Kid addKid(Long parentId, Kid kid);
}
