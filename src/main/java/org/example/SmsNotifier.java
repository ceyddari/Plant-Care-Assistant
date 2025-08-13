package org.example;

public class SmsNotifier implements NotificationStrategy {

    private final String phone;

    public SmsNotifier(String phone) {

        this.phone = phone;
    }

    @Override
    public void notify (Reminder reminder) {

        System.out.println("[SMS to " + phone + "] " + reminder);

    }

    @Override
    public String name() {

        return "SMS(" + phone + ")";

    }
}
