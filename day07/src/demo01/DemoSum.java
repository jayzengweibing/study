package demo01;
import java.util.Scanner;
public class DemoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字a:");
        int a=sc.nextInt();
        System.out.println("请输入数字b:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("数字和是:"+sum);
    }
}
