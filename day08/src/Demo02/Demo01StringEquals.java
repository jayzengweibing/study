package Demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] charArray={'h','e','l','l','o'};
        String str3=new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals("hello"));
        System.out.println("hello".equals(str3));
        System.out.println("============");
        String strA="Java";
        String strB="java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
