package Demo02;

public class PointMain {
    public static void main(String[] args) {
        Point point=new Point();
        point.setX(10);
        point.setY(11);
        point.setZ(12);
        Point p2=new Point();
        p2.setX(12);
        p2.setY(13);
        p2.setZ(14);

        boolean b= point.equals(null);

        System.out.println(b);

    }
}
