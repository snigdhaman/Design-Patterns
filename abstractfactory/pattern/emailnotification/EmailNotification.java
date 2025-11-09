package abstractfactory.pattern.emailnotification;

import abstractfactory.pattern.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send (String message) {
        System.out.println(message);
    }
}
