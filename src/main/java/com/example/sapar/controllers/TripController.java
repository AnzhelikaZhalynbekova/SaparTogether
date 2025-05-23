package com.example.sapar.controllers;

import com.example.sapar.entities.Trip;
import com.example.sapar.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("trip")
public class TripController {
    @Autowired
    TripService tripService;
    @GetMapping("trips")
    public ResponseEntity<List<Trip>> getAllTrips() {
        return tripService.getAllTrips();
    }

    @GetMapping("trips/{location}")
    public ResponseEntity<List<Trip>> getTripsByLocation(@PathVariable String location) {
        return tripService.getTripsByLocation(location);
    }

    @GetMapping("trip/{id}")
    public ResponseEntity<Optional<Trip>> getTripById(@PathVariable int id) {
        return tripService.getTripById(id);
    }
}
