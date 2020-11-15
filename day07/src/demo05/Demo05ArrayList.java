package demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArrayList {
    public static void main(String[] args) {
        Random r =new Random();
        ArrayList<Integer> bigList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100);
            bigList.add(num);
        }
        System.out.println(bigList);
        ArrayList<Integer> smallList=getSmallList(bigList);
        System.out.println("偶数是多少个:"+smallList.size());
        System.out.println(smallList);
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num= bigList.get(i);
            if(num%2==0){
                smallList.add(i);
            }
        }
        return smallList;
    }
}
