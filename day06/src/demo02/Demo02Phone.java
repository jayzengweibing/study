package demo02;

public class Demo02Phone {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println(two.brand);

    }
    public static Phone getPhone(){
        Phone one=new Phone();
        one.brand="hasee";
        one.price=9999;
        one.color="black";
        return (one);
    }
}
