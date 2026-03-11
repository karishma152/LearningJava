package DesignPattern.Observer.Push;

public class WhatsappApp implements Observer{

    @Override
    public void update(String notification) {
        System.out.println("WhatsApp received notification: " + notification);
    }
}
