package demo03;

public class DemoPerson {
    public static void main(String[] args) {
        Person person=new Person();
        person.show();
        person.setAge(99);
        person.name="jack";
        person.show();
    }
}
