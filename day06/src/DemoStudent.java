
public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("==============");
        stu.name="xiao";
        stu.age=99;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===============");
        stu.eat();
        stu.sleep();
        stu.study();
    }

}
