package Demo02;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        DemoGroupLeader leader=new DemoGroupLeader("群主",1000);
        leader.fullMoney();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入金额:");
        int groupMoney=sc.nextInt();
        System.out.println("请输入次数:");
        int count=sc.nextInt();
        ArrayList<Double> list= leader.send(groupMoney,count);
        if(list==null){
            System.out.println("群主穷鬼吧");
            return;
        }
        DemoGroupUser m=new DemoGroupUser("张三",0);
        DemoGroupUser m1=new DemoGroupUser("李四",10);
        DemoGroupUser m2=new DemoGroupUser("老王",0);
        m.openMoney(list);
        m1.openMoney(list);
        m2.openMoney(list);
        m.fullMoney();
        m1.fullMoney();
        m2.fullMoney();
        leader.fullMoney();
    }
}
