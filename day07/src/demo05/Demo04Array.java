package demo05;

import java.util.ArrayList;

public class Demo04Array {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        System.out.println(list);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {

            if(i==list.size()-1){
                System.out.print(list.get(i)+"}");
            }else{
                System.out.print(list.get(i)+"@");
            }
        }
    }
}
