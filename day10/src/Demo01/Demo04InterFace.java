package Demo01;

public class Demo04InterFace {
    public static void main(String[] args) {
    MyInterFacePrivateImpl impl=new MyInterFacePrivateImpl();
    impl.methodDefaultA();
    impl.methodDefaultB();
        System.out.println("===========");
    MyInterFacePrivateB.methodDefaultA();
    MyInterFacePrivateB.methodDefaultB();

    }
}
