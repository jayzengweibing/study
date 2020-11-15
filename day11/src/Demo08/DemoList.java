package Demo08;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> result =list(list);
        System.out.println(result);
    }
    public static List<String> list(List<String> list){
        list.add("毛泽东");
        list.add("邓小平");
        list.add("江泽民");
        list.add("刘少奇");
        return list;
    }
}
