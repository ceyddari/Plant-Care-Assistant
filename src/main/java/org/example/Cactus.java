package org.example;

public class Cactus extends Plant{

    public Cactus(String name, LightLevel light, SoilType soil, int baseDays, java.time.LocalDate lastWatered, java.time.LocalDate lastFertilized) {
        super(name, light, soil, baseDays, lastWatered, lastFertilized);

    }

    @Override
    public int wateringIntervalDays() {
        int d = getBaseWaterIntervalDays() + 5;
        return Math.max(d,5);
    }

    @Override
    public int fertilizeIntervalDays() {
        return 60;
    }
}
