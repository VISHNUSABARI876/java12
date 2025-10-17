package end;
import java.util.*;
public class sd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        float a=obj.nextInt();
        double cir=2*Math.PI*a;
        double area=Math.PI*a*a;
        float f1=(float) cir;
        float f2=(float) area;
        System.out.printf("Circumference: %.2f meters",f1);
        System.out.println("");
        System.out.printf("Area: %.2f Square meters",f2);
        
	}

}
