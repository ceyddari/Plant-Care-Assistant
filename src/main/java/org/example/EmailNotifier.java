package org.example;

public class EmailNotifier implements NotificationStrategy{

    private final String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void notify(Reminder reminder) {

        System.out.println("[EMAIL to " + email + "] " + reminder);
    }

    @Override
    public String name() {
        return "Email(" + email + ")";
    }
}
