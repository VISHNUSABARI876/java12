package practice.java;
import java.util.*;
public class exception {
      public static void main(String[] argv) {
    	  Scanner obj=new Scanner(System.in);
    	  try {
    	  int a=obj.nextInt();
    	  int b=10/0;
    	  }
    	  catch(InputMismatchException e) {
    		  System.out.println("Enter valid input");
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("Arithmetic error");
    	  }
    	              
  
    	  System.out.println("Program ended");
      }
}
//if we enter invalid input it is inputmismatch error
//if we enter invalid mathematical problem it is arithemetic error
