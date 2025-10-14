package methods;
public class Returnobj {
	Returnobj display(Returnobj o) {
		System.out.println(o);
		Returnobj p=new Returnobj();
		System.out.println(p);
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Returnobj obj=new Returnobj();
        System.out.println(obj);
        Returnobj r=obj.display(obj);
        System.out.println(r);
	}

}
