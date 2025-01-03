package com.services.umsservice.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;


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

    public void setParent(Parent parent) {
        this.parent = parent;
    }

}
