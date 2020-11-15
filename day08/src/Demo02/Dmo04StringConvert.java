package Demo02;

public class Dmo04StringConvert {
    public static void main(String[] args) {
        char[] chars="hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==========");
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=========");
        String str1="hello";
        String str2=str1.replace("h","*");
        System.out.println(str2);
    }
}
