package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Schueler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerRepository extends JpaRepository<Schueler, Integer> {

}
