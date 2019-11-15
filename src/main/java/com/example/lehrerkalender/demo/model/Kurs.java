package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert einen Schulkurs
<<<<<<< Updated upstream
 * @class Kurs
 * @author Janik Schaaf
 * @version 1.0
=======
 *
 * @author Janik Schaaf
 * @version 1.0
 * @class Kurs
>>>>>>> Stashed changes
 */
@Entity
@Table(name = "kurs")
@Getter
@Setter
public class Kurs {
    /**
     * @attr automatisch erzeugte ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * @attr Lehrperson des Kurses
     */
    @ManyToOne
    @JoinColumn(name = "idLehrer")
    private Lehrer lehrer;

    /**
     * @attr die zu unterrichtende Klasse
     */
    @ManyToOne
    @JoinColumn(name = "idKlasse")
    private Klasse klasse;

    /**
     * @attr das Fach welches gelehrt wird
     */
    @ManyToOne
    @JoinColumn(name = "idFach")
    private Fach fach;
}
