package Demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        int length="fjhsfhksfkfslnf".length();
        System.out.println("字符串长度为:"+length);
        System.out.println("=============");
        String str1="hello";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("============");
        char ch="hello".charAt(2);
        System.out.println("在二号字符串为:"+ch);
        System.out.println("=============");
        String str4="helloworld";
        int str=str4.indexOf("wo");
        System.out.println("wo的位置为"+str);

    }
}
