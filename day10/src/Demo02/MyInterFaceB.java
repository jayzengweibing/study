package Demo02;

public interface MyInterFaceB {
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodC(){
        System.out.println("默认方法er");
    }
}
