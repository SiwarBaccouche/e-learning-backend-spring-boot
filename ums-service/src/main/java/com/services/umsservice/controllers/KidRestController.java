package com.services.umsservice.controllers;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import com.services.umsservice.services.IServiceKid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/e-learning/kids")
@AllArgsConstructor
public class KidRestController {
    private final IServiceKid serviceKid;

    @GetMapping("/{kidId}/get-parent")
    public ResponseEntity<Parent> getParent(@PathVariable Long kidId) {
        Parent parent = serviceKid.getParent(kidId);
        return ResponseEntity.ok(parent);
    }
}




