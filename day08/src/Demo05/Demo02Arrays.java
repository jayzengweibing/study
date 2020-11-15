package Demo05;

import java.util.Arrays;

public class Demo02Arrays {
    public static void main(String[] args) {
        String str="qwepoiuytghsvxm";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }
    }
}
