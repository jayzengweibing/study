public class Dwhle{
	public static void main(String[] args){
		int i=0;
		do{
			System.out.println("hello");
			i++;
		}while(i<=3);
		int sum=0;
		int x=0;
		do{ if(x%2==0){
			sum +=x;
		}
			x++;
		}while(x<=100);
	    System.out.println("sum:"+sum);
	    int a;
		for(a=0;a<=10;a++){
			if(a==3){
				
				break;
			}
			System.out.println("hello:"+a);
		}
		int b;
		for(b=0;b<=10;b++){
			if(b==2){
				continue;
			}
			System.out.println("hello"+b);
		}
		for(int c=0;c<5;c++){
			for(int d=0;d<8;d++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}