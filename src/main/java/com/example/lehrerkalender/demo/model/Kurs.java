package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kurs")
@Getter
@Setter
public class Kurs {
    @Id
    private int id;
    private Lehrer lehrer;
    private Klasse klasse;
}
