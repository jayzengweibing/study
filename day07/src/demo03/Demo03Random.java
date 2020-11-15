package demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int num=r.nextInt(101);
        while(true) {
            System.out.println("请输入猜测的数字:");
            int a=sc.nextInt();
            if(a>num){
                System.out.println("输入大啦");
            }else if(a<num){
                System.out.println("输入小啦!");
            }else{
                System.out.println("输入正确");
                break;
            }
        }
    }
}
