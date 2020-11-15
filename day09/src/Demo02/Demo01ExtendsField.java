package Demo02;

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu str=new Fu();
        System.out.println(str.fu);
        Zi str1=new Zi();
        System.out.println(str1.zi);
        System.out.println(str1.fu);
        System.out.println("============");
        System.out.println(str1.num);
        System.out.println(str.num);
        System.out.println("============");
        str1.methodZi();
        str1.methodFu();
    }
}



