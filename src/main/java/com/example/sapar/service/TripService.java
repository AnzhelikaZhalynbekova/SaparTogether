package com.example.sapar.service;

import com.example.sapar.entities.Trip;
import com.example.sapar.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TripService {
    @Autowired
    TripRepository tripRepository;

    public ResponseEntity<List<Trip>> getAllTrips() {
        try {
            return new ResponseEntity<>(tripRepository.findAll(), HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Trip>> getTripsByLocation(String location) {
        try{
            return new ResponseEntity<>(tripRepository.findAllByLocation(location), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Optional<Trip>> getTripById(int id) {
        try{
            return new ResponseEntity<>(tripRepository.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(Optional.empty(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Trip> createTrip(Trip trip) {
        try{
            return new ResponseEntity<>(tripRepository.save(trip), HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Trip> updateTrip(Trip trip) {
        try{
            return new ResponseEntity<>(tripRepository.save(trip), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteTrip(int id) {
        try{
            tripRepository.deleteById(id);
            return new ResponseEntity<>("Trip deleted", HttpStatus.OK );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Can't delete", HttpStatus.BAD_REQUEST);
    }
}
