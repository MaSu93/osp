package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert die einen Schueler im Kontext der Unterrichtsstunde
 * @class UnterrichtsstundeSchueler
 * @author Alexander Goujov
 * @version 1.0
 */
@Entity
@Table(name = "unterrichtsstundeSchueler")
@Getter
@Setter
public class UnterrichtsstundeSchueler {
    /**
     * @attr automatisch erzeugte ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * @attr Der Schueler im Kontext der Unterrichtsstunde
     */
    @ManyToOne
    @JoinColumn(name = "idSchueler")
    private Schueler schueler;
    /**
     * @attr Die dazugehörige Unterrichtsstunde
     */
    @ManyToOne
    @JoinColumn(name = "idUnterrichtsstunde")
    private Unterrichtsstunde unterrichtsstunde;
    /**
     * @attr gibt an, ob der Schueler anwesend war oder nicht
     */
    private boolean anwesend;
    /**
     * @attr gibt an wie hoch die Verspätung des Schuelers war
     */
    private int verspaetung;
    /**
     * @attr die spezifische Note des Schuelers zu der Unterrichtsstunde
     */
    private String note;
    /**
     * @attr ein Kommentar zu dem Schueler zu der Unterrichtsstunde
     */
    private String kommentar;
}
