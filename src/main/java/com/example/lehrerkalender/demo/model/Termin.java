package com.example.lehrerkalender.demo.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert einen Termin im Terminkalender einer Lehrperson
 * @class Termin
 * @author Florain Küpper
 * @version 1.0
 */
@Entity
@Table(name = "termin")
@Getter
@Setter
public class Termin {

    /**
    * @attr automatisch erzeugte ID
    */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
    * @attr Inhalt des Termin
    */
    private String inhalt;

    /**
    * @attr persönilcher Kommentar zum Termin
    */
    private String kommentar;

    /**
    * @attr Anfangszeitpunkt des Termins
    */
    private LocalDate beginn;
    
    /**
    * @attr Endzeitpunkt des Termins
    */
    private LocalDate ende;
}
