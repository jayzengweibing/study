package Demo02;

public class Demo03StringSub {
    public static void main(String[] args) {
        String str1="helloworld";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=========");
        String str3=str1.substring(3,7);
        System.out.println(str3);
        System.out.println("==========");
        String str4="hello";
        System.out.println(str4);
        str4="java";
        System.out.println(str4);
    }
}
