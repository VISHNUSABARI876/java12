package twodarrays;
import java.util.Scanner;
public class diagonal {
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
    	int sum=0;
    	for(int j=2;j>i;j--) {
    		  sum=arr[j][i];
    	}
    	System.out.println(sum);
    }
}
}