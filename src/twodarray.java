import java.util.Scanner;
import java.util.Arrays;
public class twodarray {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		arr[i][j]=obj.nextInt();
        	}
        	System.out.println();
        }
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		if(arr[i][j]%2!=0) {
        			System.out.print("0 ");
        		}
        		else {
        			System.out.print(arr[i][j]+" ");
        		}
        	}
        	System.out.println();
        }
        
}
}
