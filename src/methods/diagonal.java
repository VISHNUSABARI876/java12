package methods;
import java.util.Scanner;
public class diagonal {
	Scanner obj=new Scanner(System.in);  //obj-instance var
    int a=obj.nextInt();                 //a 
    int num =a;
    int display(){
    	int[][] arr=new int[num][num];
    	for(int i=0;i<num;i++) {
    		for(int j=0;j<num;j++) {
    		    arr[i][j]=obj.nextInt();
    	    }
    		System.out.println();
    	}
    	 
    	for(int i=0;i<num;i++) {
    		for(int j=0;j<num;j++) 
    		{
    			if(i==j) {            //arr[i][j]==0,i+j==2,
    				System.out.print("1 ");
    			}
    			else {
    				System.out.print("0 ");
    			}
    	    }
    		System.out.println();
    	}
    	return num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        diagonal sc=new diagonal();
        sc.display();
	}

}
