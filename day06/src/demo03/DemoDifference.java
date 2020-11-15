package demo03;

import com.sun.javafx.tools.packager.Param;

public class DemoDifference {
        String name;

    public  void methodA(){
        int num=10;
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int Param){
        System.out.println(Param);
    }
}
