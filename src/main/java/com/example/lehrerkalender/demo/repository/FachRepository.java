package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Fach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FachRepository extends JpaRepository<Fach, String> {
    boolean existsByNutzerNameAndPasswort(String nutzerName, String passwort);
}
