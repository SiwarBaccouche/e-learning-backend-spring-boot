package com.services.umsservice.repositories;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

}
