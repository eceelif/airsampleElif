package com.project.airsample.controllers.elifFlight;

import com.project.airsample.elifAir.managers.AirportManager;
import com.project.airsample.elifAir.airport.AirPortList;
import com.project.airsample.elifAir.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elifAir/airport")
public class ElifAirPortController {

    @Autowired
    private AirportManager airportManager;

    @Autowired
    @Qualifier("elifAirPortList")
    private AirPortList elifAirportList;

    @GetMapping("/list")
    public AirPortList getAirports() {
        return elifAirportList;
    }

    @GetMapping("/{id}")
    public Airport getAirport(@PathVariable int id) {
        return airportManager.getAirportById(id);
    }

    @PostMapping("/")
    public boolean saveAirport(@RequestBody Airport airport) {
        return airportManager.saveAirport(airport);
    }

    @PutMapping("/")
    public boolean updateAirport(@RequestBody Airport airport) {
        return airportManager.updateAirport(airport);
    }

    @DeleteMapping("/{id}")
    public Airport deleteAirport(@PathVariable int id) {
        return airportManager.deleteAirport(id);
    }
}
