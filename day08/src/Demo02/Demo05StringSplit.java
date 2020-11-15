package Demo02;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str="aaa,bbb,ccc";
        String[] str1=str.split(",");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        System.out.println("===========");
        String str2="xxx.yyy.zzz";
        String[] str3=str2.split("\\.");
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }

    }
}
