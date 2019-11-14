package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "kursSchueler")
@Getter
@Setter
public class KursSchueler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idSchueler")
    private Schueler schueler;
    @ManyToOne
    @JoinColumn(name = "idKurs")
    private Kurs kurs;
    private String endnote;
}
