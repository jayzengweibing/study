package Demo01;

public class Demo02Final {
    public static void main(String[] args) {
        Person name=new Person();
        Person a=new Person("adada");
        System.out.println(a);
        System.out.println(a.getName());
        System.out.println(name.getName());
        System.out.println(name);
        name= new Person("hello");
        System.out.println(name.getName());
        System.out.println(name);
    }
}
