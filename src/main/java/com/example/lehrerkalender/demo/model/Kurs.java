package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "kurs")
@Getter
@Setter
public class Kurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idLehrer")
    private Lehrer lehrer;
    @ManyToOne
    @JoinColumn(name = "idKlasse")
    private Klasse klasse;
    @ManyToOne
    @JoinColumn(name = "idFach")
    private Fach fach;
}
