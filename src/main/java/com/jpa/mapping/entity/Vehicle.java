package com.jpa.mapping.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@Table(name = "vehicle")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @OneToOne(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private Owner owner;
}