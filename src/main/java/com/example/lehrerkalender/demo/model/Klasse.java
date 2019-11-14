package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import com.example.lehrerkalender.demo.model.Lehrer;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "klasse")
@Getter
@Setter
public class Klasse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Lehrer klassenlehrer;
}
