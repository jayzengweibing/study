package demo02;

import java.util.Scanner;

public class Demo01Anonymous {
    public static void main(String[] args) {
       //普通使用方式
       /* Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt(); */

        //匿名对象方式
        //int sum=new Scanner(System.in).nextInt();
        //System.out.println("输入的是:"+sum);

        //使用一般写法注入参数
        //Scanner sc=new Scanner(System.in);
        //methodParam(sc);

        //使用匿名对象
        //methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num=sc.nextInt();
        System.out.println("输入的数是:"+num);

    }
    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是:"+i);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
