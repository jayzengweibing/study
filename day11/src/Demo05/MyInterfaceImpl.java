package Demo05;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("实现类覆盖重写方法A");
    }

    @Override
    public void method1() {
        System.out.println("实现类覆盖重写方法B");
    }
}