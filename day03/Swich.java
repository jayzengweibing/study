public class Swich{
	public static void main(String[] args){
		int weekday=7;
		switch(weekday){
		    case 1:
			  System.out.println("��һ");
			  break; 
			case 2:
			  System.out.println("�ܶ�");
			  break;
			case 3:
			  System.out.println("����");
			  break;
			case 4:
			  System.out.println("����");
			  break;
			case 5:
			  System.out.println("����");
			  break;
			case 6:
			  System.out.println("����");
			  break;
			case 7:
			  System.out.println("����");
			  break;
			default:
			  System.out.println("��������");
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
		System.out.println("1��100��ż������:"+sum);
	}
}
			  
			
		