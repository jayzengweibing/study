package Demo07;

public class Zi extends Fu {
    int num=20;
    public void num(){
        System.out.println(num);
        System.out.println(super.num);
    }


    public void method(){
        super.method();
        System.out.println("子类方法");
    }
    public Zi(){
        super();
        System.out.println("子类构造方法");
    }
}
