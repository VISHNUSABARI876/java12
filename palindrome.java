package end;
import java.util.*;
public class palindrome 
{
   public static void main(String[] argv) {
	   System.out.println("Enter a number:");
	   Scanner obj=new Scanner(System.in);
	   int a=obj.nextInt();
	   int org_num=a;
	   int rev=0;
	   while(a!=0) {
		   rev=rev*10+a%10;
		   a=a/10;
	   }
	   if(rev==org_num) {
	       System.out.println("It is a palindrome");
       }
	   else {
		   System.out.println("It is not a palindrome");
	   }
}
}
