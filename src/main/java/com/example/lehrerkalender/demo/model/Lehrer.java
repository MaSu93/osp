package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert eine Lehrperson
 * @class Lehrer
 * @author Alexander Goujov
 * @version 1.0
 */
@Entity
@Table(name = "lehrer")
@Getter
@Setter
public class Lehrer {

    /**
    * @attr Nutzername zum anmelden des Lehrers
    */
    @Id
    private String nutzerName;

    /**
    * @attr Passwort zum anmelden des Lehrers
    */
    private String passwort;
    
    /**
    * @attr Name des Lehrers
    */
    private String name;
}
