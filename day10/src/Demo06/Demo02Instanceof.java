package Demo06;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        if(animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.catMouse();
        }
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.watchHouse();
        }
        System.out.println("=========");
        giveMePet(new Dog());
    }
    public static void giveMePet(Animal animal){
        if(animal instanceof Cat){
            animal.eat();
            Cat cat=(Cat) animal;
            cat.catMouse();
        }
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            animal.eat();
            dog.watchHouse();
    }

    }
}
