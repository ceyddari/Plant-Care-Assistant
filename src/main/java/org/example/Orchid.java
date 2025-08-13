package org.example;

public class Orchid extends Plant{
    public Orchid(String name, LightLevel light, SoilType soil, int baseDays, java.time.LocalDate lastWatered, java.time.LocalDate lastFertilizied) {
        super(name, light, soil, baseDays, lastWatered, lastFertilizied);

    }

    @Override
    public int wateringIntervalDays(){
        int d = getBaseWaterIntervalDays() -2;
        return Math.max(d,2);
    }

    @Override
    public int fertilizeIntervalDays() {
        return 20;
    }
}
