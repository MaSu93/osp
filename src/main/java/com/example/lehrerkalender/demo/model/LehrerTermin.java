package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert einen Termin eines Lehrers
 * @class LehrerTermin
 * @author Alexander Goujov
 * @version 1.0
 */
@Entity
@Table(name = "lehrerTermin")
@Getter
@Setter
public class LehrerTermin {
    /**
     * @attr automatisch erzeugte ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * @attr repräsentiert den Lehrer
     */
    @ManyToOne
    @JoinColumn(name = "idLehrer")
    private Lehrer lehrer;
    /**
     * @attr repräsentiert den Termin
     */
    @ManyToOne
    @JoinColumn(name = "idTermin")
    private Termin termin;
}
