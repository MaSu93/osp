package com.example.lehrerkalender.demo.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "termin")
@Getter
@Setter
public class Termin {
    @Id
    private Integer id;
    private String inhalt;
    private String kommentar;
    private LocalDate beginn;
    private LocalDate ende;
}
