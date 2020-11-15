package demo03;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println("===========");
        Student stu1=new Student("xiaohai",56);
        System.out.println("名字是:"+stu1.getName()+" 年龄是:"+stu1.getAge());
        System.out.println("============");
        stu1.setName("张三");
        stu1.setAge(66);
        System.out.println("名字是:"+stu1.getName()+" 年龄是:"+stu1.getAge());
    }
}
