package conditionalstat;
import java.util.Scanner;
public class ifclause 
{

	public static void main(String[] args) 
	{
		int n=2;
		int count=0;
		/*
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        	System.out.println(i);
        	count++;
        	}
        	
        }*/
        for(int i=2;i<=Math.sqrt(n);i++) {
        	if(n%i==0) {
            	System.out.println(i);
            	count++;
            	}
        }
        if(count==0) {
        System.out.println("prime number");
        }
   }
}