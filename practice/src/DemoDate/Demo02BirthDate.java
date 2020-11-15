package DemoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02BirthDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入出生日期 格式 年-月-日 ");
        String date=sc.next();
        Date date1=new Date();
        Date date2=sdf.parse(date);
        long time=date2.getTime();
        long time1=date1.getTime();
        long time2=time1-time;
        System.out.println(time2/1000/3600/24);


    }

}
