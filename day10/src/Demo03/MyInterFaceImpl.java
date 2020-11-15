package Demo03;

public class MyInterFaceImpl implements MyInterFace {
    @Override
    public void methodC() {
        System.out.println("方法来自于我自己");
    }

    @Override
    public void methodA() {
        System.out.println("方法来自于A");
    }

    @Override
    public void methodB() {
        System.out.println("方法来自于B");
    }

    @Override
    public void methodComm() {
        System.out.println("方法来自于A和B");
    }

}
