package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Garden garden = new Garden();

        Plant c1 = new Cactus("Saguaro", LightLevel.HIGH, SoilType.SANDY, 7,
                LocalDate.now().minusDays(9), LocalDate.now().minusDays(35));
        Plant o1 = new Orchid("Phalaenopsis", LightLevel.MEDIUM, SoilType.LOAMY, 4,
                LocalDate.now().minusDays(3), LocalDate.now().minusDays(19));

        garden.add(c1);
        garden.add(o1);

        System.out.println(garden);

        CareScheduler scheduler = new CareScheduler(garden);
        List<Reminder> todays = scheduler.generateReminders(LocalDate.now());

        NotificationStrategy notifier = new EmailNotifier("user@example.com");
        for (Reminder r : todays) notifier.notify(r);

        for (Reminder r : todays) {
            if (r.getTaskType() == TaskType.WATER) r.getPlant().waterToday(LocalDate.now());
            if (r.getTaskType() == TaskType.FERTILIZE) r.getPlant().fertilizeToday(LocalDate.now());

        }

        List<Reminder> afterUpdate = scheduler.generateReminders(LocalDate.now());
        System.out.println("Remaining reminders: " + afterUpdate.size());
    }
}