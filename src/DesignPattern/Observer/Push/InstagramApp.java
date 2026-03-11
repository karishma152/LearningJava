package DesignPattern.Observer.Push;

public class InstagramApp implements Observer{
    @Override
    public void update(String notification) {
        System.out.println("Instagram received an notification: " + notification);
    }
}
