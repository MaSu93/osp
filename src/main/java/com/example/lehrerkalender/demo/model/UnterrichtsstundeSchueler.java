package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "unterrichtsstundeSchueler")
@Getter
@Setter
public class UnterrichtsstundeSchueler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idSchueler")
    private Schueler schueler;
    @ManyToOne
    @JoinColumn(name = "idUnterrichtsstunde")
    private Unterrichtsstunde unterrichtsstunde;
    private boolean anwesend;
    private int verspaetung;
    private String note;
    private String kommentar;
}
