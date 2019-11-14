package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "unterrichtsstunde")
@Getter
@Setter
public class Unterrichtsstunde extends Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idKurs")
    private Kurs kurs;
    @ManyToOne
    @JoinColumn(name = "idLehrer")
    private Lehrer lehrer;
}
