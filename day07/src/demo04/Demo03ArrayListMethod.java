package demo04;

import java.util.ArrayList;

public class  Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        String name=list.get(1);
        System.out.println(name);
        int sum=list.size();
        System.out.println(sum);
    }
}
