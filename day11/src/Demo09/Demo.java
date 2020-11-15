package Demo09;

public class Demo {
    public String str="6";
    public static void main(String[] args) {
        Demo sv=new Demo();
        sv.change(sv.str);
        System.out.println(sv.str);
    }
    public void change(String str) {
        str="10";
    }
}
