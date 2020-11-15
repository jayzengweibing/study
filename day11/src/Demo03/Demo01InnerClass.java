package Demo03;

public class Demo01InnerClass {
    public static void main(String[] args) {
        new Body().method();
        System.out.println("================");

        Body.Heart heart=new Body().new Heart();
        heart.beat();

    }
}
