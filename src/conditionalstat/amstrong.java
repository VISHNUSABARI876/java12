package conditionalstat;

public class amstrong {

	public static void main(String[] args) {
		int num=1634;
		String str=Integer.toString(num);
		int count=str.length();  //4
		int sum=0;
	    int a=num;               //1634
		while(num!=0)  
		{
			int last=num%10;     //4  3  6
			last=(int) Math.pow(last, count);  //256 81 1296 1
			sum=sum+last;                      //256+81+1296+1=1634
			num/=10;                           //163 16 1 0
		}
		System.out.println(sum);	
		if(sum==a) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("not an amstrong number");
		}
	}

}


