package abstractfactory.pattern;

import abstractfactory.pattern.emailnotification.EmailNotificationFactory;
import abstractfactory.pattern.smsnotification.SMSNotificationFactory;

public class NotificationService {
    public static void main (String[] args) {
        NotificationFactory smsNotificationFactory = new SMSNotificationFactory();
        Notification smsNotification = smsNotificationFactory.createNotification();
        NotificationFormatter smsFormatter = smsNotificationFactory.createNotificationFormatter();

        smsNotification.send(smsFormatter.format("Test SMS Message"));

        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        Notification emailNotification = emailNotificationFactory.createNotification();
        NotificationFormatter emailFormatter = emailNotificationFactory.createNotificationFormatter();

        emailNotification.send(emailFormatter.format("Test mail"));
    }
}
