package com.afad.poc.locationtracker.api;


import com.afad.poc.locationtracker.entity.Location;
import com.afad.poc.locationtracker.repository.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public ResponseEntity<Location> saveLocation(@RequestBody Location location)
    {
        return new ResponseEntity<>(locationService.saveLocation(location), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Location>> getAllLocations() {
        return new ResponseEntity<>(locationService.getAllLocations(),HttpStatus.OK);
    }
}
