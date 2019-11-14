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
    private String inhalt;
    private String kommentar;
    private LocaleDate beginn;
    private LocaleDate ende;
}
