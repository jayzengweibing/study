package Demo05;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("==========");
        NewPhone newphone=new NewPhone();
        newphone.call();
        newphone.send();
        newphone.show();
    }
}
