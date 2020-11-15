public class Swich{
	public static void main(String[] args){
		int weekday=7;
		switch(weekday){
		    case 1:
			  System.out.println("周一");
			  break; 
			case 2:
			  System.out.println("周二");
			  break;
			case 3:
			  System.out.println("周三");
			  break;
			case 4:
			  System.out.println("周四");
			  break;
			case 5:
			  System.out.println("周五");
			  break;
			case 6:
			  System.out.println("周六");
			  break;
			case 7:
			  System.out.println("周日");
			  break;
			default:
			  System.out.println("输入有误");
			  break;
		}
		int x;
		for(x=0;x<=2;x++){
			System.out.println("hi");
		}
		int sum=0;
		int y;
		for(y=0;y<=100;y++){
			if(y%2==0){
				sum +=y;
			    
			}
		}
		System.out.println("1到100的偶数和是:"+sum);
	}
}
			  
			
		