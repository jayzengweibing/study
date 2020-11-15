package Demo01;

import java.util.Scanner;

public class DemoNumber {

    /***
     * 求最大公约数
     * @param a 一个int数值a
     * @param b 一个int数值b
     * @return 返回最大公约数gys
     */
    public int gongyueshu(int a,int b){
        int gys = 1;
        for (int i = 1; i <Math.min(a, b) ; i++) {
            if(a%i==0&&b%i==0){
                 gys=Math.max(i,gys);
            }

        }
        return gys;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }
}
