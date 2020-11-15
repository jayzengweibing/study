package Demo03;

import javax.xml.namespace.QName;

public class Body {
    public  class Heart{
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println(name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void method(){
        System.out.println("外部类方法");
        new Heart().beat();
    }
}
