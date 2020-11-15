package Demo01;

import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        a = Math.max(0,Math.min(a,99));


        int b=a/10;

        switch (b){
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("良好");
                break;
            case 8:
                System.out.println("优秀");
                break;
            case 9:
                System.out.println("非常优秀");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }
}
