package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LehrerTerminRepository extends JpaRepository<LehrerTermin, Integer> {
}
