package Demo05;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray={1,2,3};
        String intStr= Arrays.toString(intArray);
        System.out.println(intStr);
        int[] array1={2,4,1,6,10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String[] array2={"aaa","abb","acc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
