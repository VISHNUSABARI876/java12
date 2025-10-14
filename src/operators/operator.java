package operators;
import java.util.Scanner;
public class operator {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println((int)Math.pow(a,b));
        System.out.println(Math.floor(2.8));
        System.out.println(Math.ceil(2.8));
        System.out.println(Math.round(2.8));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((float)a/b);
        System.out.println(a%b);
	}

}
