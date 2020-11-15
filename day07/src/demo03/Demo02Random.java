package demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        for (int i = 0; i <100 ; i++) {
            int num=r.nextInt(n) + 1;
            System.out.println(num);
        }
    }
}
