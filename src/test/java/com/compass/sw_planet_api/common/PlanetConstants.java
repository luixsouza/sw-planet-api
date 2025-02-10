package com.compass.sw_planet_api.common;

import com.compass.sw_planet_api.domain.Planet;

public class PlanetConstants {
    
    public static final Planet PLANET = new Planet("name", "climate");
    public static final Planet INVALID_PLANET = new Planet("", "");
}
