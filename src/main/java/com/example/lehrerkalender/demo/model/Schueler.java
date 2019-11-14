package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert einen Schüler/eine Schülerin
 * @class Schueler
 * @author Janik Schaaf
 * @version 1.0
 */
@Entity
@Table(name = "schueler")
@Getter
@Setter
public class Schueler {

    /**
    * @attr automatisch erzeugte ID
    */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
    * @attr Name des Schülers
    */
    private String name;
    
    /**
    * @attr Klasse in welcher der Schüler sich befindet
    */
    private Klasse klasse;
}
