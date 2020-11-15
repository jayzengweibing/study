package Demo07;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        //Mouse mouse=new Mouse();
        //USB usb=new Mouse();
        //usb.openDevice();
        Computer.useDevice(new Mouse());

       // usb.closeDevice();
        System.out.println("=================");
       // Keyboard keyboard=new Keyboard();
       // keyboard.openDevice();

        Computer.useDevice(new Keyboard());
       // keyboard.closeDevice();
        computer.powerOff();
    }
}
