package com.services.umsservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@DiscriminatorValue("P")
public class Parent extends User {
    private int numberOfKids;

//    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    @JsonIgnore
//    private List<Kid> kids = new ArrayList<>();
//
//    public List<Kid> getKids() {
//        return kids;
//    }

    @ManyToMany(mappedBy = "parents", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Kid> kids = new ArrayList<>();

    public List<Kid> getKids() {
        return kids;
    }

}
