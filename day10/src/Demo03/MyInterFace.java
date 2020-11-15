package Demo03;

public interface MyInterFace extends MyInterFaceA,MyInterFaceB {
    public abstract void methodC();

    @Override
    default void methodDefault() {
        System.out.println("默认方法重写");
    }
}
