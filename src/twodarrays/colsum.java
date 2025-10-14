package twodarrays;

import java.util.Scanner;

public class colsum {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
    int arr[][]=new int[3][3];
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr.length;j++) {
    		arr[i][j]=obj.nextInt();
    }
   	System.out.println();
    }
    for(int j=0;j<arr.length;j++) {
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		  sum=sum+arr[i][j];
    	}
    	System.out.println(sum);
    }
}
}