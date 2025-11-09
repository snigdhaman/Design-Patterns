package abstractfactory.pattern.smsnotification;

import abstractfactory.pattern.Notification;

public class SMSNotification implements Notification {

    @Override
    public void send (String message) {
        System.out.println(message);
    }
}
