package conditionalstat;
import java.util.Scanner;
public class spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int sum = 0;
		int mul=1;
		while(a!=0) {
			int last=a%10;
			sum=sum+last;
			mul=mul*last;
			a/=10;
		}
		System.out.println(sum);
		System.out.println(mul);
		if(sum==mul) {
			System.out.println("fine number");
		}
		else {
			System.out.println("not a fine number");
		}
		
     
	}

}
