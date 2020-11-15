package Demo04;

public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student one=new Student("毛泽东",88);
        Student two=new Student("毛岸英",90);
        one.room="101教室";
        System.out.println("名字叫:"+one.getName()+" 年龄是:"+one.getAge()+
                " 所在教室:"+one.room+" 学号是:"+one.getId());
        System.out.println("名字叫:"+two.getName()+" 年龄是:"+two.getAge()+
                " 所在教室:"+two.room+" 学号是:"+two.getId());

    }
}
