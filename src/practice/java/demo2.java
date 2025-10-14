package practice.java;
import java.util.*;
public class demo2 {
	  String myname;
      demo2(){
    	  System.out.println("Hello");      }
      void display(String myname) {
    	  this.myname=myname;
      }
      public static void main(String[] argv) {
    	  demo2 obj=new demo2();
    	  obj.display("mark");
    	  System.out.println(obj.myname);
    	  
      }
	
}
