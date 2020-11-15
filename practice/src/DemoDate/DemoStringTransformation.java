package DemoDate;

public class DemoStringTransformation {
    public static void main(String[] args) {
        int num=Integer.parseInt("120");
        System.out.println(num);
        String s=100+"";
        System.out.println(s+600);
        String s1=Integer.toString(200);
        System.out.println(s1+111);
        String s2=String.valueOf(123);
        System.out.println(s2+456);
        int num1=Integer.parseInt(s2);
        System.out.println(num1+100);
    }
}
