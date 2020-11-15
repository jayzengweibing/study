package Demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DemoArray {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 4, 4, 7, 6, 5, 2, 0, 2, 1};
        int[] x1 = new int[10];
        int n=0;

        ArrayList<Integer> y = new ArrayList<>();
        for(int v:x){
            y.add(v);
        }
        Integer[] integers = y.toArray(new Integer[y.size()]);

        for (Integer s:integers) {
            System.out.print(s);

        }
    }




}
