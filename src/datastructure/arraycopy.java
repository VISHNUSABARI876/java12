package datastructure;
import java.util.Arrays;
public class arraycopy {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        int dest[]=new int[10];
        System.arraycopy(arr,2,dest,4,arr.length-2);
        System.out.println(Arrays.toString(dest));
	}
}
