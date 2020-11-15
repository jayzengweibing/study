package Demo01;

public interface MyInterFaceDefault {
    public abstract void methodA();
    public default void methodDefault(){
        System.out.println("这是默认方法");
    }
}
