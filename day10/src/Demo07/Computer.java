package Demo07;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public static void useDevice(USB usb){
        if(usb != null) {
            usb.openDevice();
            if (usb instanceof Mouse) {
                Mouse mouse = (Mouse) usb;
                mouse.click();
            } else if (usb instanceof Keyboard) {
                Keyboard keyboard = (Keyboard) usb;
                keyboard.type();
            }
            usb.closeDevice();
        }
    }
}
