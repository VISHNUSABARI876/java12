package conditionalstat;

public class maximum {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		int[] a= {3,7,8};
//		int largestnum=a[0];        //3
//		for(int i=0;i<a.length;i++) //3 7 8
//		{
//			if(a[i]>largestnum) //3>3 7>3  8>7
//			{
//				largestnum=a[i];  //7 8
//			}
//		}
//		System.out.println(largestnum);
		int a=123975;
		int max=a%10;
		while(a!=0) {
			if(a%10>max) {    //5>5
				max=a%10;     
			}
			a/=10;
		}
		System.out.println(max);
	}

}
