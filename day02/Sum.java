public class Sum{
	public static void main(String[] args){
		int i = 1;
		byte c = 2;
		long su = i + c;
		System.out.println(su);
		double s1u = i + c;
		System.out.println(s1u);
		short s2u = (short)(i+c);
		System.out.println(s2u);
		long s = 32767L;
		s = (long)(s+10);
		System.out.println(s);
		char d = 'a';
		int e = 2;
		System.out.println(d+e);
		int g = 2345;
		System.out.println(g/1000*1000);
		int h = 1;
		int j = ++h;
		System.out.println(h);
		System.out.println(j);
		String k = "a";
		String l = "b";
		System.out.println(k+l);
		int sub = 10;
		sub+=100;
		System.out.println(sub);
		System.out.println(3>4);
		System.out.println(10&4);
	}
}
	