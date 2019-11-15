package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * repräsentiert eine Unterrichtsstunde als Speziallfall eines Termins
 *  @class Unterrichtsstunde
 *  @author Alexander Goujov
 *  @version 1.0
 */
@Entity
@Table(name = "unterrichtsstunde")
@Getter
@Setter
public class Unterrichtsstunde extends Termin {
    /**
     * @attr automatisch erzeugte ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * @attr Der Kurs dem die Unterrichtsstunde zugeordnet ist
     */
    @ManyToOne
    @JoinColumn(name = "idKurs")
    private Kurs kurs;
    /**
     * @attr Der Lehrer, der tatsächlich diese Unterrichtsstunde unterrichten wird oder unterrichtet hat
     */
    @ManyToOne
    @JoinColumn(name = "idLehrer")
    private Lehrer lehrer;
}
