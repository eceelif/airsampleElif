package com.project.airsample.elifAir.interfaces;

import com.project.airsample.elifAir.airport.Airport;

import java.util.List;

public interface IAirportManager {
    Airport getAirportById(int id);

    List<Airport> getAllAirports();

    boolean saveAirport(Airport airport);

    boolean updateAirport(Airport airport);

    Airport deleteAirport(int id);
}
