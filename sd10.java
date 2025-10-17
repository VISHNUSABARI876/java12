package end;
import java.util.*;
public class sd10 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0 && i%3!=0) {
				System.out.print(i+" ");
			}
		}
		

	}

}
