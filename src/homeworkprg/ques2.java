package homeworkprg;

import java.util.Arrays;

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
//		for(int i=0;i<arr.length/2;i++) {
//			int temp=arr[i];    //1
//			arr[i]=arr[arr.length-i-1];   //5
//			arr[arr.length-i-1]=temp;     //1
//			
//		}
	     int start = 0;
	     int end = arr.length- 1;

	     while (start < end) 
	     {
	         int temp = arr[start];
	         arr[start] = arr[end];
	         arr[end] = temp;
	         start++;
	         end--;
	    }
		System.out.println(Arrays.toString(arr));
		

	}

}
