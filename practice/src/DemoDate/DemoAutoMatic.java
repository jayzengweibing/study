package DemoDate;

import java.util.ArrayList;

public class DemoAutoMatic {
    public static void main(String[] args) {
        Integer i=2; //自动装箱
        i=i+3;   //自动转换再计算
        System.out.println(i);
        ArrayList<Integer> list=new ArrayList<>();
        boolean add = list.add(12);
        int l = list.get(0);
        System.out.println(l);
        System.out.println(add);
    }
}
