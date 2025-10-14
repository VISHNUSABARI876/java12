package practice.java;


class a{
	int one=1;
}
class b extends a{
	int two=2;
	
}
class c extends b{
	int three=3;
}
public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        c obj=new c();
        System.out.println(obj.one);
        System.out.println(obj.two);
	}

}
