package factory.pattern;

public class NotificationService {
    public static void main (String[] args) {
        try {
            NotificationFactory notificationFactory = new NotificationFactory();
            Notification notification1 = notificationFactory.createNotification("SMS");
            notification1.send("Test message 1");
            Notification notification2 = notificationFactory.createNotification("Email");
            notification2.send("Test message 2");
            Notification notification3 = notificationFactory.createNotification("Whatsapp");
            notification3.send("Test message 3");
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
