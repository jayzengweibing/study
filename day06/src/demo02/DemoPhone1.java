package demo02;

public class DemoPhone1 {
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
        System.out.println("=============");
        Phone pho1 =new Phone();
        pho1.brand="华为";
        pho1.price=7999;
        pho1.color="白";
        System.out.println(pho1.brand);
        System.out.println(pho1.price);
        System.out.println(pho1.color);
        System.out.println("==========");
        pho1.call("lei");
        pho1.sendMessage();
    }

}


