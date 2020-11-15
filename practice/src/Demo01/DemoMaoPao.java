package Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DemoMaoPao {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 56, 3, 78, 39,22};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}