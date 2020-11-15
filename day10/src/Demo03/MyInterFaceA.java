package Demo03;

public interface MyInterFaceA {
    public abstract void methodA();
    public abstract void methodComm();
    public default void methodDefault(){
        System.out.println("默认方法一");
    }
}
