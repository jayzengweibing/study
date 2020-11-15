package DemoNoteBook;

public class Laptop {
    public void run(){
        System.out.println("开机");
    }
    public void useUSB(usbInterface usb){
        if(usb!=null){
            usb.open();
            if(usb instanceof Mouse){
                Mouse m=(Mouse) usb;
                m.mouseClick();
            }else  if(usb instanceof Keyboard){
                Keyboard k=(Keyboard) usb;
                k.keyboardKnock();
            }
            usb.close();
        }
    }
    public  void powerDown(){
        System.out.println("关机");
    }
}
