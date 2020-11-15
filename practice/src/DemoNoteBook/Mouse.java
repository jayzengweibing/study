package DemoNoteBook;

public class Mouse implements usbInterface{

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }
    public void mouseClick(){
        System.out.println("点击鼠标");
    }
}
