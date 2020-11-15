package Demo01;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int y = r.nextInt(949);
            y = Math.abs(y)+50;
            System.out.println(y);
        }


    }
}
