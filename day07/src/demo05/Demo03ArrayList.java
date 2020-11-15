package demo05;

import java.util.ArrayList;

public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("李荣浩");
        list.add("古巨基");
        list.add("陈浩南");
        list.add("黄晓明");
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name= list.get(i);
            if(i==list.size()-1){
                System.out.print(name+"}");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}

