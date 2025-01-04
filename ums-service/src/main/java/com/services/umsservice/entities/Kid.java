package com.services.umsservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@DiscriminatorValue("U")
public class Kid extends User{
    private String school;
    private int age;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    public Parent getParent() {
        return parent;
    }

}
