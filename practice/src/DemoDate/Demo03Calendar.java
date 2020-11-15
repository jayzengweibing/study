package DemoDate;

import java.sql.SQLOutput;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Demo03Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Date time = c.getTime();
        int year=c.get(Calendar.YEAR);
        int mon=c.get(Calendar.MONTH);
        System.out.println(year);
        System.out.println(mon);
        c.add(Calendar.YEAR,10);
        int year1=c.get(Calendar.YEAR);
        c.add(Calendar.MONTH,-2);
        int mon1=c.get(Calendar.MONTH);
        System.out.println(year1);
        System.out.println(mon1);
        System.out.println(time);


    }
    public  static void demo(){
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,2099);
        c.set(Calendar.MONTH,11);


        int year=c.get(Calendar.YEAR);
        System.out.println(year);
        int month=c.get(Calendar.MONTH);
        System.out.println(month+1);
        int date=c.get(Calendar.DATE);
        System.out.println(date);
        int hours=c.get(Calendar.HOUR_OF_DAY);
        System.out.println(hours);
        int min=c.get(Calendar.MINUTE);
        System.out.println(min);
        int sec=c.get(Calendar.SECOND);
        System.out.println(sec);
    }
}
