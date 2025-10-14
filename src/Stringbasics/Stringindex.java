package Stringbasics;
public class Stringindex {

	public static void main(String[] args) 
	{
	 String str="The quick brown foxn";
	 System.out.println(str.indexOf('c'));
	 System.out.println(str.indexOf("c"));
	 System.out.println(str.indexOf("brown"));
	 System.out.println(str.indexOf("bad"));
	 System.out.println(str.lastIndexOf("n"));
	 System.out.println(str.indexOf("c",9));
	 System.out.println(str.indexOf("c",9,12));
	 System.out.println(str.contains("own"));
	 System.out.println(str.contains("cat"));
	 System.out.println(str.substring(0,9));
	 System.out.println(str.endsWith("brown"));  
	 System.out.println(str.repeat(2));          //repeat 2times the string.
	}

}
