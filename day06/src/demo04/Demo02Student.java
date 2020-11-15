package demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2=new Student("hello",55);
        System.out.println("name: "+stu2.getName()+" age: "+stu2.getAge());
        stu2.setAge(20);
        System.out.println("name: "+stu2.getName()+" age: "+stu2.getAge());
    }
}
