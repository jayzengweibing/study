package Demo01;

public class Demo02StringPool {
    public static void main(String[] args) {
        String stu1="abc";
        String stu2="abc";
        char[] charArray={'a','b','c'};
        String stu3=new String(charArray);
        byte[] byteArray={97,98,99};
        String stu4=new String(byteArray);
        System.out.println(stu4);
        System.out.println(stu1);
        System.out.println(stu3);
        System.out.println(stu1==stu2);
        System.out.println(stu1==stu3);
        System.out.println(stu2==stu3);
        System.out.println(stu1==stu4);
        System.out.println(stu2==stu4);
        System.out.println(stu3==stu4);
        System.out.println(byteArray);
    }
}
