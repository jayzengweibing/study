package Demo01;

public interface MyInterFacePrivateB {
        public static void methodDefaultA(){
            System.out.println("默认方法一");
            methodC();
        }
        public  static   void methodDefaultB(){
            System.out.println("默认方法二");
            methodC();
        }
        private  static void methodC(){
            System.out.println("AAA");
            System.out.println("BBB");
        }
}

