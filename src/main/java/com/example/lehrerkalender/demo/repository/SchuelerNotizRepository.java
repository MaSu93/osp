package com.example.lehrerkalender.demo.repository;

import java.util.List;
import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerNotizRepository extends JpaRepository<Schuelernotiz, Integer> {

    List<SchuelerNotiz> findAllBySchuelerId(int id);
}
