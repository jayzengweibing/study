package demo01;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu);
        System.out.println("name:"+stu.name);
        System.out.println("age:"+stu.age);
        System.out.println("=============");
        stu.name="张三";
        stu.age=18;
        System.out.println("name:"+stu.name);
        System.out.println("age:"+stu.age);
        System.out.println("=============");
        stu.eat();
        stu.study();
    }
}
