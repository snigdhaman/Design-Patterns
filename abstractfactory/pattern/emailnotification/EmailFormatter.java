package abstractfactory.pattern.emailnotification;

import abstractfactory.pattern.NotificationFormatter;

public class EmailFormatter implements NotificationFormatter {
    @Override
    public String format(String message) {
        return "==============\nSending Email :: " + message + "\n================\n";
    }
}
