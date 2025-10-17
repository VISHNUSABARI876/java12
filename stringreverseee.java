package end;
import java.util.*;

public class stringreverseee 
{
	public static void main(String[] argv) {
      Scanner obj=new Scanner(System.in);
      String str=obj.next();
      
      String rev="";
      int len=str.length();
      
      for(int i=len-1;i>=0;i--) 
      {
    	  rev=rev+str.charAt(i);
    	  
      }
      System.out.println(rev);
  }
}
