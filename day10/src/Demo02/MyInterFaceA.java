package Demo02;

public interface MyInterFaceA {
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodC(){
        System.out.println("默认方法一");
    }
}
