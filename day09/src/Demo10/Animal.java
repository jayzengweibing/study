package Demo10;

public abstract class Animal {
    public abstract void eat();
    public void normal(){
        System.out.println("抽象方法");
    }
    public Animal(){
        System.out.println("抽象构造父类");
    }
}
