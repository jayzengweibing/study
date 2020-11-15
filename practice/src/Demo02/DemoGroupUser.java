package Demo02;

import java.util.ArrayList;
import java.util.Random;

public class DemoGroupUser extends DemoUser{
    public DemoGroupUser() {
    }

    public DemoGroupUser(String name, double money) {
        super(name, money);
    }


    public void openMoney(ArrayList<Double> list){

        Random r=new Random();
        int random=r.nextInt(list.size());
        Double money= list.remove(random);
        setMoney(money);
    }
}
