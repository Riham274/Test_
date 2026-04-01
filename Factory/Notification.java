package Factory;
// factory method pattern for notifications
 interface Notification {
    void send();
} 

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}


abstract class NotificationFactory {
    abstract Notification createNotification();
}

class EmailNotificationFactory extends NotificationFactory {
    Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSNotificationFactory extends NotificationFactory {
    Notification createNotification() {
        return new SMSNotification();
    }
}
