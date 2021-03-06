package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert eine Schülernotiz welche eine Lehrperson
 * zu einem Schüler/einer Schülerin machen kann
 * @class SchuelerNotiz
 * @author Janik Schaaf
 * @version 1.0
 */
@Entity
@Table(name = "schuelernotiz")
@Getter
@Setter
public class SchuelerNotiz {
    
    /**
    * @attr automatisch erzeugte ID
    */ 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
    * @attr Schüler welchem die Notiz zugeordnet ist
    */
    @ManyToOne
    @JoinColumn(name = "idSchueler")
    private Schueler schuelerId;

    /**
    * @attr Name der Notiz
    */
    private String key;

    /**
    * @attr Wert der Notiz
    */
    private String value;
}
