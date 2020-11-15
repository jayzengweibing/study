package Demo04;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.method();
        MyClass.method01();
        method02();
        Demo02StaticMethod.method02();
    }
    public static void method02(){
        System.out.println("本类方法！");
    }
}
