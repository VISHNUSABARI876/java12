package datastructure;
import java.util.Scanner;
public class arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of the input:");
        int n=obj.nextInt();
        int[] num=new int[n];    //array size 6   //first input;
        int total=0;
        for(int i=0;i<num.length;i++) { 
        	num[i]=obj.nextInt();     //0=20 1=20 2=20 3=20 4=20 5=20
        	total=total+num[i];       //20+20+20+20+20+20=120/5=
        }
        float avg=total/num.length;
        System.out.println(total);
        System.out.println(avg);
	}

}
 