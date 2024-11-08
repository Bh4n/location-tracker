package com.afad.poc.locationtracker.api;

import com.afad.poc.locationtracker.entity.Location;
import com.afad.poc.locationtracker.repository.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LocationWebSocketController {

    @Autowired
    private LocationService locationService;

    @MessageMapping("/send")
    @SendTo("/topic/locations")
    public Location sendLocation(Location location) {
        locationService.saveLocation(location);
        return location;
    }

}
