package Demo01;

public class Demo01String {
    public static void main(String[] args) {
        String st1=new String();
        System.out.println("字符串是:"+st1);
        System.out.println("============");
        char[] charNum={'n','好','y'};
        System.out.println(charNum);
        System.out.println("============");
        String st2=new String(charNum);
        System.out.println(st2);
        System.out.println("============");
        byte[] byteArray={97,98,99};
        System.out.println(byteArray);
        System.out.println("=========");
        String st3=new String(byteArray);
        System.out.println(st3);
        System.out.println("=========");
        String str4="Hello";
        System.out.println(str4);
    }
}
