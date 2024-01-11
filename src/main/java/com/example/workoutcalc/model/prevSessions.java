package com.example.workoutcalc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class prevSessions {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
