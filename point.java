package end;
import java.util.*;
public class point {

	public static void main(String[] args) {
		
        Scanner obj=new Scanner(System.in);
        
        
        char a=obj.next().charAt(0);
        int b=obj.nextInt();
        float c=obj.nextFloat();
        
        System.out.printf("%c %d %.2f",a,b,c);
        obj.close();
       
	}

}
