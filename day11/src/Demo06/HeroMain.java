package Demo06;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("毛泽东");
        hero.setAge(50);
        Weapon weapon=new Weapon("知识");
        hero.setWeapon(weapon);
        hero.attack();
    }
}




