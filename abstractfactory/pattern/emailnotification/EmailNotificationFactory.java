package abstractfactory.pattern.emailnotification;

import abstractfactory.pattern.Notification;
import abstractfactory.pattern.NotificationFactory;
import abstractfactory.pattern.NotificationFormatter;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification () {
        return new EmailNotification();
    }

    @Override
    public NotificationFormatter createNotificationFormatter () {
        return new EmailFormatter();
    }
}
