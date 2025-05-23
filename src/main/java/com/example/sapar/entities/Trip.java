package com.example.sapar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trip_id;
    private String name;
    private String location;
    private Date start_date;
    private Date end_date;
    private int budget;
    private int peoplenum;
    private String description;
    private String link;
}
