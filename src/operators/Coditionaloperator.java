package operators;
import java.util.*;
public class Coditionaloperator
{
    public static void main(String[] args) 
    {
          int mark=-87;
          String str= mark>=0&&mark<=100?(mark>40?"pass":"fail"):"invalid mark";
	      System.out.println(str);

	}

}
