package demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("xiaohai");
        stu.setAge(88);
        System.out.println("my name is:"+stu.getName()+" age:"+stu.getAge());
        System.out.println("================");
        Student stu1=new Student("yeye",98);
        System.out.println("my name is:"+stu1.getName()+" age:"+stu1.getAge());
        System.out.println("==============");
        stu1.setName("nainai");
        System.out.println("my name is:"+stu1.getName()+" age:"+stu1.getAge());
    }
}
