package com.example.lehrerkalender.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schülernotiz")
@Getter
@Setter
public class Kurs {
    @Id
    private int id;
    private int schuelerId;
    private String key;
    private String value;
}
