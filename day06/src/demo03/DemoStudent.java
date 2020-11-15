package demo03;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("ZHANGSAN");
        stu.setAge(28);
        stu.setMale(true);
        System.out.println("my name is "+stu.getName()+" , "+stu.getAge()+" years old "+"真男儿: "+stu.isMale());
    }
}
