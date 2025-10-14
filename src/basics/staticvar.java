package basics;
public class staticvar {
    static int num1=1;           //global variable=instance variable
    int num=1;
                                           //int num=1;    this depend on object so it prg prints 222
    void display() {
    	num1++;
    	num++;
    	System.out.println(num1);       //2  3   4
    	System.out.println(num);      //2  2  2
    }
	public static void main(String[] args) {
	staticvar obj=new staticvar();        //classname objectname=new classname();
	staticvar obj1=new staticvar();
	staticvar obj2=new staticvar();
	obj.display();
	obj1.display();
	obj2.display();   
	System.out.println(num1);



	}

}
