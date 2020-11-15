public class Shun{
	public static void main(String[] args){
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		//2.1 if 
		System.out.println("开始");
		int a=10;
		int b=10;
		if(a==b){
			System.out.println("a等于b");
		}
		int c=10;
		if(c%2==0){
			System.out.println("c是偶数");
		}else{
			System.out.println("c是奇数");
		}
		int x=8;
		int y;
		if(x>=3){
			y=2*x+1;
		}else if(x>=-1&&x<3){
			y=2*x;
		}else {
			y=2*x-1;
		}
		System.out.println(y);
		int score=61;
		if(score<0||score>100){
			System.out.println("你输入的有错误!");
		}else if(score>=90&&score<=100){
			System.out.println("你的成绩很优秀!");
		}else if(score>=80&&score<=89){
			System.out.println("你的成绩很好!");
		}else if(score>=70&&score<=79){
			System.out.println("你的成绩良好!");
		}else if(score>=60&&score<=69){
			System.out.println("你的成绩合格!");
		}else{
			System.out.println("你的成绩不合格!");
		}
		int d=10;
		int e=20;
		int f;
		if(d>e){
			f=d;
		}else {
			f=e;
		}
		System.out.println(f);
		int k=1;
		int i=2;
		int j;
		j=(k>i?k:i);
		System.out.println(j);
		
	}
}