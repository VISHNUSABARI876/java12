package operators;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
		    a=a/10;
			
		}
		System.out.println(rev);
		
		
	}

}
