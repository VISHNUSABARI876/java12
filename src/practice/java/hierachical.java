package practice.java;

class animals{
	void eat() {
		System.out.println("It can eat");
	}
}
class dogs extends animals{
	void bark() {
		System.out.println("It can bark");
	}
}
class cat extends animals{
	void meow(){
		System.out.println("It say meow");
	}
}
public class hierachical {
     public static void main(String[] argv) {
    	 cat c=new cat();
    	 c.eat();
    	 c.meow();
     }
}
