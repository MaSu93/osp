package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "klasse")
@Getter
@Setter
public class Klasse {
    @Id
    private int id;
    private Lehrer klassenlehrer;
}
