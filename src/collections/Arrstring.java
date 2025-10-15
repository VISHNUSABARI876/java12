package collections;
import java.util.*;
public class Arrstring {
    void display() 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++) 
        {
            int num = sc.nextInt();
            list.add(num);
        }
        for(int i=0; i<n; i++) 
        {
            String str = sc.next();
            list1.add(str);
        }
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        System.out.println("Before sorting:"+list1);
        Collections.sort(list1);
        System.out.println("After sorting:"+list1);
        System.out.println(list.isEmpty());  //return boolean values.
        list1.remove(0);  //remove the index element in the list.
        System.out.println(list1);
        list1.clear();  //clear all elements in the list.
        System.out.println(list1);
        System.out.println(list1.isEmpty());
    }
    public static void main(String[] args) 
    {
    	Arrstring as=new Arrstring();
        as.display();
    }
}

