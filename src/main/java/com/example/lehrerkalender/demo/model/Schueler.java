package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import com.example.lehrerkalender.demo.model.Klasse;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schueler")
@Getter
@Setter
public class Schueler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Klasse klasse;
}
