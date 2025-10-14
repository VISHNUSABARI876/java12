package conditionalstat;

public class perfect {

	public static void main(String[] args) 
	{
		int num=28;
		int count=0;
		for(int i=1;i<num;i++) 
		{
			if(num%i==0) {
				System.out.println(i);
				count=count+i;
			}
		}
		System.out.println("sum of number :"+count);
	    if(count==num) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
		

	}

}
