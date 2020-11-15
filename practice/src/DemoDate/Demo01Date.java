package DemoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) throws ParseException {
        data();
    }
    public static void data() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        Date date1=sdf.parse("2020-11-11 11:42:00");
        System.out.println(date);
        System.out.println(sdf.format(date));
        System.out.println(date1);
    }
}
