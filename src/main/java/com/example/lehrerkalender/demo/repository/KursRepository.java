package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Kurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KursRepository extends JpaRepository<Kurs, int> {
   
}
