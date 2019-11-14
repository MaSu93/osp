package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert einen Schulkurs
 * @class Kurs
 * @author Janik Schaaf
 * @version 1.0
 */
@Entity
@Table(name = "kurs")
@Getter
@Setter
public class Kurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@attr Lehrperson des Kurses
    private Lehrer lehrer;
    //@attr die zu unterrichtende Klasse
    private Klasse klasse;
    //@attr das Fach welches gelehrt wird
    private Fach fach;
}
