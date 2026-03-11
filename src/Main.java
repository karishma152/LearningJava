import DesignPattern.Observer.Push.InstagramApp;
import DesignPattern.Observer.Push.IphoneSystem;
import DesignPattern.Observer.Push.Observer;
import DesignPattern.Observer.Push.WhatsappApp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

    IphoneSystem iphone = new IphoneSystem();
    Observer whatsapp = new WhatsappApp();
    Observer instagram = new InstagramApp();

    iphone.addObserver(whatsapp);
    iphone.addObserver(instagram);

    iphone.newNotification("New message from Mom");

    DesignPattern.Observer.Pull.IphoneSystem iphonePull = new DesignPattern.Observer.Pull.IphoneSystem();
    DesignPattern.Observer.Pull.Observer whatsApp = new DesignPattern.Observer.Pull.WhatsAppApp(iphonePull);
    iphonePull.addObserver(whatsApp);
    iphonePull.newNotification("Battery Low");

}
