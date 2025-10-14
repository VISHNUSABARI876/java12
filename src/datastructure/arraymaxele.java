package datastructure;
public class arraymaxele {

	public static void main(String[] args) {
		int[] num={3,5,9,2,6};
		int a=num[0];
		int temp=a;
		for(int i=0;i<num.length;i++) {  //0<5 1<5 2<5 3<5 4<5 5<5
			 if(num[i]>a) {              //-3>-3 -5>-3 -7>-3 -1>-3 -9>-1
				 a=num[i];               //a=-1
			 }
			 System.out.println(num[i]);
		}
		System.out.println("Maximum number is "+a);
		int b=temp;
		for(int i=0;i<num.length;i++) {  //0<5 1<5 2<5 3<5 4<5 5<5
			 if(num[i]<b) {              //-3>-3 -5>-3 -7>-3 -1>-3 -9>-1
				 b=num[i];               //a=-1
			 }
			 System.out.println(num[i]);
		}
		System.out.println("Minimum number is "+b);
		

	}

}
