package methods;

public class overloading {
    void sum(int a,int b) {
    	System.out.println(a+b);
    }
    void sum(float a,float b) {
    	System.out.println(a*b);
    }
    void sum(int a,float b) {
    	System.out.println(a+b);
    }
	public static void main(String[] args) {
		overloading ol=new overloading();
	    ol.sum(10,5);
	    ol.sum(10.0f, 5.7f);
	    ol.sum(10,5.2f);        
	    //called method first compare exact match of parameters.
	}
}
