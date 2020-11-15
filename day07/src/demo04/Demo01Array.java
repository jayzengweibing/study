package demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array=new Person[3];
        Person one=new Person("迪丽热巴",24);
        Person two=new Person("古力娜扎",23);
        Person three=new Person("乔布斯",999);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[0].getName());
    }
}
