package Demo07;

public class Keyboard implements USB{
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("敲打键盘");
    }
}
