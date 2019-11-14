package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Klasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlasseRepository extends JpaRepository<Klasse, Integer> {
   
}
