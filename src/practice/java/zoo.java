package practice.java;

class person{
	String name;
	person(String name){
		this.name=name;
	}
}
class employee extends person{
	employee(String name){
		super(name);
	}
	
}

public class zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       employee e=new employee("John");
       System.out.println(e.name);
        
        
        
	}

}
