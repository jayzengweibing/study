public class Meth{
	public static void main(String[] args){
		methodName();
	}
	public static void methodName(){
		System.out.println("这是一个方法");
		int i = 0;
		i = (i==2 ? 10:20);
		System.out.println(i);
		short a = 1;
		a +=1;
		System.out.println(a);
		byte a1=1;
		byte a2=2;
		byte a3=1+2;
		byte a4=(byte)(a1+a2);
		System.out.println(a3);
		System.out.println(a4);
	
	}
}