package Demo01;

public interface MyInterFacePrivateA {
    public default void methodDefaultA(){
        System.out.println("默认方法一");
        methodC();
    }
    public  default  void methodDefaultB(){
        System.out.println("默认方法二");
        methodC();
    }
    private void methodC(){
        System.out.println("AAA");
        System.out.println("BBB");
    }
}
