package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerNotizRepository extends JpaRepository<Schuelernotiz, int> {

    List<SchuelerNotiz> findAllBySchuelerId(int id);
}
