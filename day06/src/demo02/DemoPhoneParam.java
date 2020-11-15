package demo02;

public class DemoPhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "魅族";
        one.price = 2888;
        one.color = "yellow";
        method(one);
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
