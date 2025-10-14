package datastructure;

import java.util.Arrays;

public class arrayrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,2,3,4,5};
        int temp=arr[0];
        arr[0]=arr[2];
        arr[2]=temp;
        for(int i=0;i<arr.length;i++) {
        	System.out.println(i+":"+arr[i]);
        }
        for(int n:arr) {
        	System.out.println(n);
        } 
        System.out.println(Arrays.toString(arr));
       
        
	}

}
