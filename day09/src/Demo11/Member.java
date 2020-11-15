package Demo11;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int take=new Random().nextInt(list.size());
        int delete= list.remove(take);
        int money=super.getMoney();
        super.setMoney(money+delete);

    }
}
