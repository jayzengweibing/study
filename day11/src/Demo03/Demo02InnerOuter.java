package Demo03;

public class Demo02InnerOuter {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        inner.methodInner();
    }
}
