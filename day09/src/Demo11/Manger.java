package Demo11;

import java.util.ArrayList;
public class Manger extends User{
    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> sendMoney(int money,int count){
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney=super.getMoney();
        if(money>leftMoney){
            System.out.println("你余额不足");
            return redList;
        }
        super.setMoney(leftMoney-money);
        int a=money/count;
        int b=money%count;
        for (int i = 0; i < count-1; i++) {
            redList.add(a);
        }
        int c=a+b;
        redList.add(c);
        return redList;
    }
}
