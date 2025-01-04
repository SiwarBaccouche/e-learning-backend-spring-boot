package com.services.umsservice.controllers;

import com.services.umsservice.entities.Admin;
import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.services.IServiceAdmin;
import com.services.umsservice.services.IServiceKid;
import com.services.umsservice.services.IServiceParent;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/e-learning/admins")
@AllArgsConstructor
public class AdminRestController {

    private final IServiceAdmin serviceAdmin;
    private final IServiceKid serviceKid;
    private final IServiceParent serviceParent;

    @GetMapping("/kids")
    public ResponseEntity<List<Kid>> listAllKids() {
        List<Kid> kids = serviceKid.getAllKids();
        return ResponseEntity.ok(kids);
    }

    @GetMapping("/parents")
    public ResponseEntity<List<Parent>> listAllParents() {
        List<Parent> parents = serviceParent.getAllParents();
        return ResponseEntity.ok(parents);
    }

    @GetMapping("/admins")
    public ResponseEntity<List<Admin>> listAllAdmins() {
        List<Admin> admins = serviceAdmin.getAllAdmins();
        return ResponseEntity.ok(admins);
    }
}