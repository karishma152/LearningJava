package DesignPattern.Observer.Pull;

import DesignPattern.Observer.Push.WhatsappApp;

public class WhatsAppApp implements Observer{

    private IphoneSystem iphone;

    public WhatsAppApp(IphoneSystem iphone){
        this.iphone = iphone;
    }
    @Override
    public void update() {
        String notification = iphone.getNotification();
        System.out.println("WhatsApp pulled notification: " + notification);
    }
}
