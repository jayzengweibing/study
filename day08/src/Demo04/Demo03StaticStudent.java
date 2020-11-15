package Demo04;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room="110教室";
        Student name=new Student("黄蓉",19);
        System.out.println("名字是:"+name.getName());
        System.out.println("年龄是:"+name.getAge());
        System.out.println("所在教室是:"+Student.room);

    }
}
