package com.services.umsservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@DiscriminatorValue("K")
public class Kid extends User{
    private String school;
    private int age;

    @ManyToMany
    @JoinTable(
            name = "kid_parent",
            joinColumns = @JoinColumn(name = "kid_id"),
            inverseJoinColumns = @JoinColumn(name = "parent_id")

    )
    private List<Parent> parents = new ArrayList<>();

}
