package Demo09;

public class Zi extends Fu {
    int num=20;

    @Override
    public void Fu() {
        super.Fu();
        System.out.println("子类方法");
    }
    public void number(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
