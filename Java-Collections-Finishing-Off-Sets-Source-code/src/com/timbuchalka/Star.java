package com.timbuchalka;

public class Star extends HeavenlyBody {
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, bodyTypes.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite.getBodyType() == bodyTypes.PLANET) {
            return super.addSatellite(satellite);
        } else {
            return false;
        }
    }
}
