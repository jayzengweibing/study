package demo04;

import java.util.ArrayList;

public class Demo04ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("迪丽热巴");
        list.add("122");
        list.add("123434");
        System.out.println(list);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}
