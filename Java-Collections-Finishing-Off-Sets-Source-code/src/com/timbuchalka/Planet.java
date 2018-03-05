package com.timbuchalka;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, bodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite.getBodyType() == bodyTypes.MOON) {
            return super.addSatellite(satellite);
        } else {
            return false;
        }
    }
}
