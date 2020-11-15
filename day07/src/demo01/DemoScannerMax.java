package demo01;

import java.util.Scanner;

public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a=sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b=sc.nextInt();
        System.out.println("请输入第三个数字:");
        int c=sc.nextInt();

        //三元运算符比较
        /*int tmp=a>b?a:b;
        int max=tmp>c?tmp:c; */

        //for循环比较
        /*int max=0;
        int[] array={a,b,c}--;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
        }

        }*/

        //if语句与逻辑运算符比较
        /*int max;
        if(a>=b&&a>=c){
            max=a;
        }else if(b>=a&&b>=c){
            max=b;
        }else{
            max=c;} */

        //if语句
        int max;
        if(a>b){
            max=a;
        }else if(b<c){
            max=c;
        }else{
            max=b;
        }
        System.out.println("最大的数是:"+max);
    }
}
