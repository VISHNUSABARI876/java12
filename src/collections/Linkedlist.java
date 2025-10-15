package collections;
import java.util.*;

public class Linkedlist {
	Scanner obj=new Scanner(System.in);
	int a=obj.nextInt();
	void display() {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(3);
		System.out.println(list);
	} 

	public static void main(String[] args) {
		 //syntax for linked list.
		Linkedlist ll=new Linkedlist();
		ll.display();
	}

}
//used to follow the concept of doubly linked list.
//insertion and deletion faster in Linkedlist compare to Arraylist.
//pop-to display and remove the data.
//push-insert the data.
//peak-to display the top element.
 