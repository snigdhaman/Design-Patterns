package factory.pattern;

public class EmailNotification implements Notification {
    public void send (String message) {
        System.out.println("Sending email notification " + message);
    }
}
