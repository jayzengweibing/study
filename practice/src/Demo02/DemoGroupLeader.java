package Demo02;

import java.util.ArrayList;

public class DemoGroupLeader extends DemoUser{
    public DemoGroupLeader() {
    }

    public DemoGroupLeader(String name, double money) {
        super(name, money);
    }
    public ArrayList<Double> send(int groupMoney,int count){
        double leftMoney=getMoney();
        if(groupMoney>leftMoney){
            System.out.println("钱不够");
            return null;
        }
        setMoney(leftMoney-groupMoney);
        ArrayList<Double> list=new ArrayList<>();
        groupMoney=groupMoney*100;
        int a=groupMoney/count;
        int b=groupMoney%count;
        for (int i = 0; i < count-1; i++) {
            list.add(a/100.0);
        }if(b==0){
            list.add(a/100.0);
        }else {
            list.add((a+b)/100.0);
        }
        return list;

    }
}
