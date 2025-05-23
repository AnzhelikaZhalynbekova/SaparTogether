package com.example.sapar.service;

import com.example.sapar.entities.Trip;
import com.example.sapar.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    TripRepository tripRepository;
    public ResponseEntity<List<Trip>> getAllTrips() {
        return new ResponseEntity<>(tripRepository.findAll(), HttpStatus.OK);
    }
}
