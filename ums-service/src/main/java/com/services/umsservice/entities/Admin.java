package com.services.umsservice.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Admin extends User{
    private String department;
}
