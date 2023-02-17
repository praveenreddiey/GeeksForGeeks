package org.designpatterns;

public class FactoryPattern {
    public static void main(String[] args) {
        Notification sms = NotificationFactory.createNotification("Push");
        sms.notifyUser();
    }
}
interface Notification {
    void notifyUser();
}
class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}
class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}
class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Push notification");
    }
}
class NotificationFactory{
    public static Notification createNotification(String notification){
        if(notification==null || notification.isEmpty())
            return null;
        switch(notification){
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            case "Push":
                return new PushNotification();
            default:
                throw new RuntimeException("no such notification found");
        }
    }
}
