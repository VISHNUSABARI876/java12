package conditionalstat;
import java.util.Scanner;
public class switchcase 
{
   public static void main(String[] args) 
   {
	   Scanner obj=new Scanner(System.in);
	   int a=obj.nextInt();
	   for(int i=1;1<=a;i++) 
	   {
	     int c=obj.nextInt();
	     switch(c) 
	     {
	      case 1:
	    	  System.out.println("monday");
	    	  break;
	      case 2:
	    	  System.out.println("tuesday");
	    	  break;
	      case 3:
	    	  System.out.println("wednesday");
	    	  break;
	      case 4:
	    	  System.out.println("thursday");
	    	  break;
	      case 5:
	    	  System.out.println("friday");
	    	  break;
	      case 6:
	    	  System.out.println("saturday");
	    	  break;
	    
	    
	    	  
	      }
	   }
	   
   }
}
