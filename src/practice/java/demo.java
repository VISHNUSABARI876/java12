package practice.java;
import java.util.*;
                                    //single inheritance
class animal{              //super class
	void eat() {
		System.out.println("It can eat");
	}
}
class dog extends animal{   //derived class
	void bark() {
		System.out.println("It can bark");
	}
}
public class demo{
	
	public static void main(String[] argv) {
		dog d=new dog();
		d.eat();
		d.bark();
		
	}

}
