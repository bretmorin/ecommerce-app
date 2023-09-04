package com.example.ecommerceapp.dao;

import com.example.ecommerceapp.entities.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "vacation", collectionResourceRel = "vacation")
public interface VacationRepository extends JpaRepository<Vacation, Long> {
}
