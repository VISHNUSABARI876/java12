package nestedlooping;

public class star{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++) 
        {
        	for(int j=1;j<=i;j++) 
        	{
        		for(int k=1;k>=j;j++)  {
        		System.out.print("*");
        		}
        	}
        	System.out.println(); 
        }
	}

}//for(initialization;condition;increment){
//             statement
// }
