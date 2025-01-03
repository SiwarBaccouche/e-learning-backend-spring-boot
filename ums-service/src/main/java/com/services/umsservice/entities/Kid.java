package com.services.umsservice.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Kid extends User{
    private String school;
    private int age;
}
