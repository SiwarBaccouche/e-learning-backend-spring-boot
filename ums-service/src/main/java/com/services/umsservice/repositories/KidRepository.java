package com.services.umsservice.repositories;

import com.services.umsservice.entities.Kid;
import com.services.umsservice.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KidRepository extends JpaRepository<Kid, Long> {


    Optional<Kid> findByUsername(String username);
}
