package Demo02;

import java.util.Date;

public class DemoMain {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        Person person = new Person("hello", 50);
        System.out.println(person);
    }
}
