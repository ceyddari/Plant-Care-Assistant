package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CareScheduler {

    private final Garden garden;

    public CareScheduler(Garden garden) {

        this.garden = garden;
    }

    public List<Reminder> generateReminders(LocalDate today) {

        List<Reminder> out = new ArrayList<>();

        for (Plant p : garden.getPlants()) {
            LocalDate nextWater = p.getLastWatered().plusDays(p.wateringIntervalDays());
            if (!today.isBefore(nextWater)) out.add(new Reminder(p, TaskType.WATER, nextWater));

            LocalDate lastF = p.getLastFertilized();
            LocalDate nextFert = lastF.plusDays(p.fertilizeIntervalDays());
            if(!today.isBefore(nextFert)) out.add(new Reminder(p, TaskType.FERTILIZE, nextFert));
        }
        return out;
    }
}
