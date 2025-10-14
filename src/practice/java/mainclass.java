package practice.java;
import java.util.*;
class laptop{
	String lapname;
}
class accessories extends laptop{
	String name;
}
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		accessories a=new accessories();
		a.name="motherboard";
		System.out.println(a.lapname);

	}

}
