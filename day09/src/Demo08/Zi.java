package Demo08;

public class Zi extends Fu{
    int num=20;
    public void showNumber(){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
        methodA();  //  this.methodA()
        System.out.println("BBB");
    }
    public Zi(){
        this(123);
        System.out.println("无参");
    }
    public Zi(int num){
        int a=3;
        System.out.println("有参");
    }

}
