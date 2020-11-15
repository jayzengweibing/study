package demo03;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("I am "+name+", "+age+" years old");
    }
    public void setAge(int num){
        if(num<0){
            System.out.println("输入错误");
        }else{
        age=num;
        }
    }
    public int getAge(){
        return age;
    }
}
