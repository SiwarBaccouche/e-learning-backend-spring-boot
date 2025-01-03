package com.services.umsservice.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Parent extends User {
    private int numberOfKids;
}
