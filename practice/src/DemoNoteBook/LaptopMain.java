package DemoNoteBook;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.run();
        usbInterface usb=new Mouse();
        l.useUSB(usb);
        usbInterface k1=new Keyboard();
        l.useUSB(k1);
        l.powerDown();
    }
}
