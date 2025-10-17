package end;
import java.util.*;
public class sd4 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		for(int i=1;i<=a;i++)
		{
			int num=obj.nextInt();
			String binary=Integer.toBinaryString(num);
			System.out.println("Binary equivalent of "+num+" is "+binary);
		}
		
		
			
		

	}

}
