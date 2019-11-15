package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert einen Schueler in einem Kurs
 * @class KursSchueler
 * @author Alexander Goujov
 * @version 1.0
 */
@Entity
@Table(name = "kursSchueler")
@Getter
@Setter
public class KursSchueler {
    /**
     * @attr automatisch erzeugte ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * @attr repräsentiert den Schueler
     */
    @ManyToOne
    @JoinColumn(name = "idSchueler")
    private Schueler schueler;
    /**
     * @attr repräsentiert den Kurs
     */
    @ManyToOne
    @JoinColumn(name = "idKurs")
    private Kurs kurs;
    /**
     * @attr Die Endnote des Schuelers in dem Kurs
     */
    private String endnote;
}
