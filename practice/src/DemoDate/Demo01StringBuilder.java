package DemoDate;

public class Demo01StringBuilder {
    public static void main(String[] args) {
        String str=new String("hello");
        System.out.println(str);
        StringBuilder str1=new StringBuilder(str);
        str1.append("world").append(100);
        System.out.println(str1);

       String s= str1.toString();
        System.out.println(s);

    }
}
