package Demo01;

public class MyInterFaceDefaultA implements MyInterFaceDefault{
    @Override
    public void methodA() {
        System.out.println("实现抽象方法");
    }
    public void methodDefault(){
        System.out.println("默认方法被重写啦A");
    }
}
