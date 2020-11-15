package DemoCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> str=new ArrayList<>();
        str.add("姚明");
        str.add("乔丹");
        str.add("科比");
        str.add("詹姆斯");
        System.out.println(str);
        Iterator<String> iter = str.iterator();
        while (iter.hasNext()){
            String str1= iter.next();
            System.out.println(str1);
        }
    }
}
