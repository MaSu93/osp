package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lehrer")
@Getter
@Setter
public class Lehrer {
    @Id
    private String nutzerName;
    private String passwort;
    private String name;
}
