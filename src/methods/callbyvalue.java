package methods;

public class callbyvalue {
    void display(int num) {
    	num=10;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        callbyvalue c=new callbyvalue();
        int num=5;
        System.out.println(num);
        c.display(num);
        System.out.println(num);
	}

}
