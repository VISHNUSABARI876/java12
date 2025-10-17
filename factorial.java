package end;
import java.util.*;
public class factorial {
    public static void main(String[] argv) {
    	System.out.println("Enter a number to be factorial:");
    	Scanner obj=new Scanner(System.in);
    	int a=obj.nextInt();
    	int fact=1;
    	/*for(int i=1;i<=a;i++) {
    		fact=fact*i;
    	}
    	System.out.println(fact);
    	*/
    	
    	for(int i=a;i>=1;i--) {
    		fact=fact*i;
    	}
    	System.out.println(fact);
    }
}
