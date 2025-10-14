package practice.java;
import java.util.*;
public class tryy {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		try {
			int a=t.nextInt();
			if(a<18) 
			{
			      throw new ArithmeticException("Entered input is negative");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am print finally when program exits.");
		}

	}

}
