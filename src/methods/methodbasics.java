package methods;  
import java.util.Scanner;
public class methodbasics {
	void display() {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		int res=a+b;
		System.out.println(res);
		return;    //in void return works like a break statement.
		           //it goes to the called function.
	}
	void kami(int a,int b) {
		if(a<b) {
			System.out.println("a smaller");
			return;
		}
		System.out.println(a-b);	
	}
	String concatenation(String str1,String str2) {
		return str1+" "+str2;
	}
	public static void main(String[] args) {  //blocks of code defined under the name or class.
		methodbasics obj=new methodbasics();
		for(int i=1;i<3;i++) {
		obj.display();
		System.out.println();
		}
		System.out.println(obj.concatenation("hello","world"));
		
	}    
}
//builtin method,user defined method:;