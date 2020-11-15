package Demo01;

public class Demo02InterFace {
    public static void main(String[] args) {
        MyInterFaceDefaultA a=new MyInterFaceDefaultA();
        a.methodA();
        a.methodDefault();
        System.out.println("===========");
        MyInterFaceDefaultB b=new MyInterFaceDefaultB();
        b.methodA();
        b.methodDefault();
        System.out.println("===========");
    }
}
