package end;
import java.util.*;
public class lastnum {
     public static void main(String[] argv) {
    	 Scanner obj=new Scanner(System.in); 
    	 int a=obj.nextInt();             //431 
    	 /*int rev=0;
    	 while(a!=0) {       
    		 rev=rev*10+a%10;             //4311  
    		 a=a/10;
    	 }
    	 System.out.println(rev);
    	 */
    	 
    	 StringBuffer sb=new StringBuffer(String.valueOf(a));
    	 StringBuffer rev=sb.reverse();
    	 
    	 System.out.println(rev);
      
     }
}
