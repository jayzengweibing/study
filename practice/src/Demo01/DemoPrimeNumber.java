package Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoPrimeNumber {
    public static void main(String[] args) {
        double min=-10.8;
        double max=2.1;
        int count=0;
        for (double i = Math.ceil(min); i <=max ; i++) {
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                count++;
            }
        }
        System.out.println(count);


   }

}



