package practice.java;

class animall{
	animall(String name){
		System.out.println(name);
	}

}
class dogg extends animall{
	dogg(){
		super("Hey you");
		System.out.println("Dog");
	}
}
public class superk {
	public static void main(String[] argb) {
          dogg d=new dogg();
	}
}
