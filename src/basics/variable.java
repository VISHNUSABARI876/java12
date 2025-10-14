package basics;

public class variable {
    String name;
    static String clg;   //clg=vcet
    void display()
    {
    	System.out.println(name+""+clg);
    }
    
	public static void main(String[] args)
	{
		variable obj=new variable();      //classname objname=new classname();
		variable obj1=new variable();
		obj.name="kabilan";
		obj.clg="vcet";
		
		obj1.name="rosehh";
		
		System.out.println(obj.name);
		System.out.println(obj.clg);
		System.out.println(obj1.name);
		System.out.println(obj1.clg);
		
		
	}

}
