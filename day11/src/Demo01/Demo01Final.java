package Demo01;

public class Demo01Final {
    public static void main(String[] args) {
        int num1=10;
        System.out.println(num1);
        num1=20;
        System.out.println(num1);
        final int num2=200;
        System.out.println(num2);
        final int num3;
        num3=50;
        System.out.println(num3);
        System.out.println("=================");
        Student stu1=new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("=============");
        stu1=new Student("马云");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("==============");
        // 对于引用类型变量来说，其中地址值不可改变
        final Student stu2=new Student("刘强东");
        System.out.println(stu2.getName());
        System.out.println(stu2);
        stu2.setName("奶茶妹");
        System.out.println(stu2.getName());
        System.out.println(stu2);
    }
}
