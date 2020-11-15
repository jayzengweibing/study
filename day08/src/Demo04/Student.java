package Demo04;

public class Student {
    private String name;
    private int age;
    private int id;
    static String room;
    private static int idCount=0;

    public Student() {
        idCount++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
