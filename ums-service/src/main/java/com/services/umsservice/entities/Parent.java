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

    @ManyToMany(mappedBy = "parents", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Kid> kids = new ArrayList<>();


}
