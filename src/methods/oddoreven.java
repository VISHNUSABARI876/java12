package methods;
import java.util.Scanner;
public class oddoreven {
	Scanner obj=new Scanner(System.in);
	int display() {
		int a=obj.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        oddoreven oe=new oddoreven();
        oe.display();
        
	}

}
