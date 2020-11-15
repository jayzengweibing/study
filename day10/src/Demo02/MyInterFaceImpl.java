package Demo02;

public class MyInterFaceImpl implements MyInterFaceA,MyInterFaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写接口一方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写AB两种方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写接口二方法");
    }

    @Override
    public void methodC() {
        System.out.println("对冲突的执行覆盖方法");

    }
}
