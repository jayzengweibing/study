package Demo01;

import java.util.Scanner;

public class DemoRabbit {
    public static void main(String[] args) {
        System.out.print("请输入兔子需要的月份:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("兔子总对数为"+sum(a));
    }
    public  static int sum(int a){
        if(a==1||a==2){
            return 1;
        }else {
            return sum(a-2)+sum(a-1);
        }
    }
}
