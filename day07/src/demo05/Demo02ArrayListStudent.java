package demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("张三",20);
        Student two=new Student("李四",21);
        Student three=new Student("李靖",22);
        Student four=new Student("妲己",18);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名是:"+list.get(i).getName()+" 年龄是:"+list.get(i).getAge());
        }
    }
}

