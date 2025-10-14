package datastructure;
import java.util.Arrays;
import java.util.Scanner;
public class bubleshort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();    //size of an array
        int num[]=new int[n];
        for(int i=0;i<num.length;i++) {
        	num[i]=obj.nextInt();
        }
        System.out.println(Arrays.toString(num));
        boolean swap=true;
        while(swap) {
        	swap=false;
        	for(int i=0;i<num.length-1;i++) {
        		if(num[i]>num[i+1]) {
        			int temp=num[i];
        			num[i]=num[i+1];
        			num[i+1]=temp;
        			swap=true;
        		}
        		System.out.println(Arrays.toString(num));
        	}
        	
        }
	}

}
