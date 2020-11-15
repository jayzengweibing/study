package Demo05;

public class DemoMain {
    public static void main(String[] args) {
        MyInterface impl=new MyInterfaceImpl();
        impl.method();
        impl.method1();
        System.out.println("=============");
        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名类覆盖重写方法A");
            }

            @Override
            public void method1() {
                System.out.println("匿名类覆盖重写方法B");
            }
        };

        obj.method();
        obj.method1();
        System.out.println("=============");
         new MyInterface(){
             @Override
             public void method() {
                 System.out.println("匿名类匿名对象覆盖重写方法A");
             }

             @Override
             public void method1() {
                 System.out.println("匿名类匿名对象覆盖重写方法B");
             }
         }.method();
        new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名类匿名对象覆盖重写方法A");
            }

            @Override
            public void method1() {
                System.out.println("匿名类匿名对象覆盖重写方法B");
            }
        }.method1();
        
    }
}
