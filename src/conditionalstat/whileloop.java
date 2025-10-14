package conditionalstat;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		//256/10=25  25%10=5
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0) 
		{
		 rev=rev*10+num%10;
		 num=num/10;
	    }
		System.out.println(rev);
        if(rev==temp) 
        {
        	System.out.println("palindrome");
        }
        else {
        	System.out.println("not a palindrome");
        }
        
    }
}
