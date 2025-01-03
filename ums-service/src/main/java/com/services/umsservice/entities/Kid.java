package com.services.umsservice.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Kid extends User{
    private String school;
    private int age;
}
