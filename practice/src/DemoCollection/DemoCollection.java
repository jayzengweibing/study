package DemoCollection;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> str=new ArrayList<>();
        System.out.println(str);
        str.add("hello");
        str.add("Java");
        str.add("heima");
        System.out.println(str);
        str.remove("hello");
        System.out.println(str);
        boolean str1 = str.contains("heima");
        System.out.println(str1);
        boolean str2 = str.isEmpty();
        System.out.println(str2);
        Object[] str3 = str.toArray();
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }
        str.clear();
        System.out.println(str);
    }
}
