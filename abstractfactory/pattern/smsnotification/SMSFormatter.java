package abstractfactory.pattern.smsnotification;

import abstractfactory.pattern.NotificationFormatter;

public class SMSFormatter implements NotificationFormatter {
    @Override
    public String format (String message) {
        return "==============\nSending SMS Message :: " + message + "\n================\n";
    }
}
