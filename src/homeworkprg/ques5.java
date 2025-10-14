package homeworkprg;

import java.util.Arrays;

public class ques5 {

	public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++) 
        {
        	    int count=0;
        	    int temp=arr[i];
        	    for(int j=1;j<=arr[i];j++) {
        		if(arr[i]%j==0) {
        			arr[i]=temp;
        			count++;
        		}
                }
        	    if(count==2) {
                	System.out.println(arr[i]+"");
                }
        }
       
        
	}

}
