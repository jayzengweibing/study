package demo02;

public class DemoPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        System.out.println(p.name);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println("===========");
        p.name = "华为";
        p.color = "流光白";
        p.price = 8999;
        System.out.println("name:" + p.name);
        System.out.println("颜色:" + p.color);
        System.out.println("价格:" + p.price);
        System.out.println("=============");
        p.call("乔布斯");
        p.sendMessage();
        System.out.println("==============");
        Phone p1 = p;
        System.out.println(p1);
        System.out.println("牌子:" + p1.name);
        System.out.println("颜色:" + p1.color);
        System.out.println("价格:" + p1.price);
        System.out.println("==============");
        p1.name = "小米";
        p1.color = "暗黑色";
        p1.price = 3999;
        System.out.println(p1);
        System.out.println("牌子:" + p1.name);
        System.out.println("颜色:" + p1.color);
        System.out.println("价格:" + p1.price);
        System.out.println("==============");
        Phone p2 = new Phone();
        System.out.println(p2);
        p2.name = "魅族";
        p2.color = "蓝色";
        p2.price = 3499;
        show(p2);
    }
        public static void show(Phone p2){
            System.out.println("牌子："+p2.name+" 价格:"+p2.price+" 颜色:"+p2.color);
        }

}
