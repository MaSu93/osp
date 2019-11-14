package com.example.lehrerkalender.demo.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "termin")
@Getter
@Setter
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String inhalt;
    private String kommentar;
    private LocalDate beginn;
    private LocalDate ende;
}
