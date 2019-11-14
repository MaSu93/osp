package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.model.Fach;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kurs")
@Getter
@Setter
public class Kurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Lehrer lehrer;
    private Klasse klasse;
    private Fach fach;
}
