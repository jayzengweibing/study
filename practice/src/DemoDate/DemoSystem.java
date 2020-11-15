package DemoDate;

import java.util.Arrays;

import static DemoDate.Demo03Calendar.demo;

public class DemoSystem {
    public static void main(String[] args) {
        arr();
    }
    public static void demo(){
        long s=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long d=System.currentTimeMillis();
        System.out.println(d-s);
    }
    public static void arr(){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        System.out.println("复制前数组为:"+ Arrays.toString(arr2));
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println("复制后数组为:"+Arrays.toString(arr2));
    }

}
