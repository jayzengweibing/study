package Demo07;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾琳");
        //一般方法
        //hero.setSkill(new HeroSkill());
        //使用匿名类
        /*Skill ski=new Skill() {
            @Override
            public void use() {
                System.out.println("一秒五箭");
            }
        };
        hero.setSkill(ski); */
        // 使用匿名对象匿名类
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("范围伤害");
            }
        });

        hero.method();
    }
}
