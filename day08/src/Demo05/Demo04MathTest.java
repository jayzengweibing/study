package Demo05;

public class Demo04MathTest {
    public static void main(String[] args) {
        double a=-10.8;
        double b=5.9;
        int c=0;
        //int i=(int)a
        for (double i =Math.ceil(a); i <b ; i++) {
            if(Math.abs(i)<2.1||Math.abs(i)>6) {
                c++;
            }
        }
        System.out.println(c);
    }
}
