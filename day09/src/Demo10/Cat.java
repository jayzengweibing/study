package Demo10;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public Cat(){
        System.out.println("子类构造方法");
    }
}
