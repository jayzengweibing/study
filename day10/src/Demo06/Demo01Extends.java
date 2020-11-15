package Demo06;

public class Demo01Extends {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        Cat cat=(Cat) animal;
        cat.catMouse();
        System.out.println("==========");

        Animal dog=new Dog();
        dog.eat();
        Dog dog1=(Dog) dog;
        dog1.watchHouse();
    }
}
