package com.compass.sw_planet_api.repository;

import org.springframework.data.repository.CrudRepository;

import com.compass.sw_planet_api.domain.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long>{

}
