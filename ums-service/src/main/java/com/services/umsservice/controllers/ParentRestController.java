package com.services.umsservice.controllers;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.services.IServiceParent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/e-learning/parents")
@AllArgsConstructor

public class ParentRestController {
    private final IServiceParent serviceParent;

    //list all the kids of the parent
    @GetMapping("/{parentId}/get-kids")
    public ResponseEntity<List<Kid>> getKids(@PathVariable Long parentId) {
        List<Kid> kids = serviceParent.getKids(parentId);
        return ResponseEntity.ok(kids);
    }



    //add a kid to a parent by a parent

    @PostMapping("/{parentId}/add-kid")
    public ResponseEntity<Kid> addKid(@PathVariable Long parentId, @RequestBody Kid kid) {
        Kid savedKid = serviceParent.addKid(parentId, kid);
        return ResponseEntity.ok(savedKid);
    }
}
