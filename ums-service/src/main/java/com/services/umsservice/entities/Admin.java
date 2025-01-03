package com.services.umsservice.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Admin extends User{
    private String department;
}
