package abstractfactory.pattern;

/**
 * Abstract factory
 */
public interface NotificationFactory {
    Notification createNotification();
    NotificationFormatter createNotificationFormatter();
}
