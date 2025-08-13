package org.example;
import java.time.LocalDate;

public class Reminder {
    private final Plant plant;
    private final TaskType taskType;
    private final LocalDate dueDate;

    public Reminder(Plant plant, TaskType taskType, LocalDate dueDate){

        this.plant = plant;
        this.dueDate = dueDate;
        this.taskType = taskType;

    }

    public Plant getPlant() { return plant; }
    public TaskType getTaskType() { return taskType;}
    public LocalDate getDueDate() { return dueDate;}

    @Override
    public String toString(){

        return taskType + " -> " + plant.getName() + " on " + dueDate;

    }



}
