package demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();

        for (int i = 0; i <100; i++) {
            int a=r.nextInt(10);
            System.out.println(a);
        }
    }
}
