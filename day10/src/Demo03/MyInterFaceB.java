package Demo03;

public interface MyInterFaceB {
    public abstract void methodB();
    public abstract void methodComm();
    public default void methodDefault(){
        System.out.println("默认方法二");
    }
}
