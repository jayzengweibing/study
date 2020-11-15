package demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        ArrayList<Integer> listC=new ArrayList<>();
        listC.add(100);
        listC.add(11);
        listC.add(55);
        System.out.println(listC);
        int num= listC.get(1);
        System.out.println(num);
        int sum=listC.size();
        System.out.println(sum);
        listC.remove(2);
        System.out.println(listC);

    }

}
