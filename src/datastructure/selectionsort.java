package datastructure;
import java.util.Arrays;
import java.util.Scanner;
public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        int arr[]= {3,8,6,1,2 };
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++) {
        		for(int j=i+1;j<arr.length;j++) {
        			if(arr[i]>arr[j]) {
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
       			    }
                 }
        		System.out.println(Arrays.toString(arr));
        }
       
        
	}

}
