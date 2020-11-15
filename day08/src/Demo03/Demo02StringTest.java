package Demo03;

import java.util.Scanner;

public class Demo02StringTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" 请输入一个字符:");
        String stu=sc.next();
        int bigA=0;
        int smallB=0;
        int numbers=0;
        int others=0;
        char[] arrays=stu.toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            char ch=arrays[i];
            if('A'<=ch&&'Z'>=ch){
                bigA++;
        }else if('a'<=ch&&'z'>=ch){
                smallB++;
            }else if('0'<=ch&&'9'>=ch){
                numbers++;
            }else {
                others++;
            }
        }
        System.out.println("大写字母有:"+bigA);
        System.out.println("小字母有:"+smallB);
        System.out.println("数字有:"+numbers);
        System.out.println("其它有:"+others);
    }
}
