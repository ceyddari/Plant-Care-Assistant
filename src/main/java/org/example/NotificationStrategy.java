package org.example;

public interface NotificationStrategy {

    void notify(Reminder reminder);
    String name();

}
