package org.example;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Plant {

    private final String id;
    private final String name;
    private final LightLevel lightLevel;
    private final SoilType soilType;
    private final int baseWaterIntervalDays;
    private LocalDate lastWatered;
    private LocalDate lastFertilized;

    protected Plant(String name, LightLevel lightLevel, SoilType soilType, int baseWaterIntervalDays,
                    LocalDate lastWatered, LocalDate lastFertilized){
        this.id = IdGenerator.nextId("PLT");
        this.name = name;
        this.lightLevel = lightLevel;
        this.soilType = soilType;
        this.baseWaterIntervalDays = baseWaterIntervalDays;
        this.lastWatered = lastWatered;
        this.lastFertilized = lastFertilized;

    }

    public String getId() {return id;}
    public String getName() {return name;}
    public LightLevel getLightLevel() {return lightLevel;}
    public SoilType getSoilType() {return soilType;}
    public int getBaseWaterIntervalDays() {return baseWaterIntervalDays;}
    public LocalDate getLastWatered() {return lastWatered;}
    public LocalDate getLastFertilized() {return lastFertilized;}


    public void waterToday(LocalDate today) {
        this.lastWatered = today;
    }

    public void fertilizeToday(LocalDate today) {
        this.lastFertilized = today;
    }

    public abstract int wateringIntervalDays();

    public int fertilizeIntervalDays() { return 30;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return Objects.equals(id, plant.id);
    }

    @Override
    public int hashCode() {return Objects.hash(id);}


    @Override
    public String toString(){
        return "Plant{id='" + id + "', name'" + name + "', light=" + lightLevel + ", soil=" + soilType + "}";
    }
}
