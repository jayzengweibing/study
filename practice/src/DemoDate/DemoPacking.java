package DemoDate;

public class DemoPacking {
    public static void main(String[] args) {
        Integer r = new Integer(12);
        System.out.println(r);
        Integer r1 = new Integer("12");
        System.out.println(r1);
        Integer r2 = Integer.valueOf(24);
        System.out.println(24);
        Integer r3 = Integer.valueOf("24");
        System.out.println(r3);
        System.out.println("=================");
        int i= r.intValue();
        System.out.println(i);
    }
}
