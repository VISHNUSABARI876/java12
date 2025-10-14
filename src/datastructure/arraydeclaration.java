package datastructure;
public class arraydeclaration {             //collection of similar data under a single variable name.

	public static void main(String[] args) 
	{
		String a[]= {"Kavin","Ele","Max","Steve"};
//		System.out.println(a[0]);
//		a[0]="Edie";
//		System.out.println(a[0]);   //it does not have negative indexing
//		System.out.println(a[-1]);      //array starting address
//		System.out.println(a.length);
//		System.out.println(a[a.length-1]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
