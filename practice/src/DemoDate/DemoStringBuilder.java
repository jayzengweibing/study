package DemoDate;

public class DemoStringBuilder {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        System.out.println(s);
        StringBuilder s2=new StringBuilder("abc");
        System.out.println(s2);
        System.out.println("==============");
//        StringBuilder b = s2.append("a");
//        System.out.println(b);
//        System.out.println(s2);
//        System.out.println(s2==b);
//        System.out.println(s2.equals(b));


//        s2.append("b");
//        s2.append(12);
//        System.out.println(s2);

        s2.append(1).append("hi").append('s').append(10.5);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);
    }
}
