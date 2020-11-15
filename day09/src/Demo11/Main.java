package Demo11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manger manger=new Manger("群主",200);
        Member one=new Member("群员A",0);
        Member two=new Member("群员B",0);
        Member three=new Member("群员c",0);
        Member four=new Member("群员d",0);
        manger.show();
        one.show();
        two.show();
        three.show();
        four.show();
        System.out.println("==========");
        ArrayList<Integer> redList= manger.sendMoney(79,4);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);
        manger.show();
        one.show();
        two.show();
        three.show();
        four.show();



    }
}
