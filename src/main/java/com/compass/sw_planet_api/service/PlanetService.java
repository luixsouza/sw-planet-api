package com.compass.sw_planet_api.service;

import org.springframework.stereotype.Service;

import com.compass.sw_planet_api.domain.Planet;
import com.compass.sw_planet_api.repository.PlanetRepository;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }
   
    public Planet create(Planet planet) {
        return planetRepository.save(planet);
    }
}
