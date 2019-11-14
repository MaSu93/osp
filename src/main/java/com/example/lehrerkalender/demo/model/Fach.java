package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert die Fachrichtung eines Kurses
 * @class Fach
 * @author Florian Küpper
 * @version 1.0
 */
@Entity
@Table(name = "fach")
@Getter
@Setter
public class Fach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@attr Name der Fachrichtung
    private String name;
}
