package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
/**
 * repräsentiert eine Schulklasse
 * @class Klasse
 * @author Janik Schaaf
 * @version 1.0
 */
@Entity
@Table(name = "klasse")
@Getter
@Setter
public class Klasse {
    
    /**
    * @attr automatisch erzeugte ID
    */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
    * @attr Klassenlehrer der Schulklasse
    */
    private Lehrer klassenlehrer;
}
