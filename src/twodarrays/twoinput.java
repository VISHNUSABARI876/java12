package twodarrays;
import java.util.Scanner;
public class twoinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		arr[i][j]=obj.nextInt();
        	}
        	System.out.println();
        }
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
