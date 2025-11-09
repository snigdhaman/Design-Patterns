package factory.pattern;

public class NotificationFactory {
    public Notification createNotification (String type) throws IllegalArgumentException {
        return switch (type) {
            case "SMS" -> new SMSNotification();
            case "Email" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Only SMS or Email type supported");
        };
    }
}
