package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "lehrerTermin")
@Getter
@Setter
public class LehrerTermin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idLehrer")
    private Lehrer lehrer;
    @ManyToOne
    @JoinColumn(name = "idTermin")
    private Termin termin;
}
