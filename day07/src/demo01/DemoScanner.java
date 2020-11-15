package demo01;
import java.util.Scanner;
public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("输入的数字是:"+num);
        String str=sc.next();
        System.out.println("字符串是"+str);
    }
}
