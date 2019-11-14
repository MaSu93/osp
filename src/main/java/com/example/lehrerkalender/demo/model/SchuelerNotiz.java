package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert eine Schülernotiz welche eine lehrperson 
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@attr Schüler welchem die Notiz zugeordnet ist
    private Integer schuelerId;
    //@attr Name der Notiz
    private String key;
    //@attr Wert der Notiz
    private String value;
}
