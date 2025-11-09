package abstractfactory.pattern.smsnotification;

import abstractfactory.pattern.Notification;
import abstractfactory.pattern.NotificationFactory;
import abstractfactory.pattern.NotificationFormatter;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification () {
        return new SMSNotification();
    }

    @Override
    public NotificationFormatter createNotificationFormatter() {
        return new SMSFormatter();
    }
}
