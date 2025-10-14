package conditionalstat;

public class exbrkcon {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=17;
		boolean flag=true;
		for(int i=2;i<=num/2;i++) 
		{
			if(num%2==0) {
				flag=false;
				break;
			}
		}
		if(flag) 
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println("not a prime number");
		}

	}

}
