package DemoNoteBook;

public class Keyboard implements usbInterface {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");

    }
    public void keyboardKnock(){
        System.out.println("敲打键盘");
    }
}
