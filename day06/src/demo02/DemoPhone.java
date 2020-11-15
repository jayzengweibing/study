package demo02;

public class DemoPhone {
    public static void main(String[] args) {
        Phone pho=new Phone();
        pho.brand="小米";
        pho.price=1999;
        pho.color="珍珠白";
        System.out.println(pho.brand);
        System.out.println(pho.price);
        System.out.println(pho.color);
        System.out.println("==========");
        pho.call("leibusi");
        pho.sendMessage();
    }
}
