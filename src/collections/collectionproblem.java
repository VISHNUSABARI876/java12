package collections;
import java.util.*;
public class collectionproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		collectionproblem obj=new collectionproblem();
		Stack<Integer> st=new Stack<Integer>();
		for(int i=1;i<=4;i++) {
			int a=sc.nextInt();
			st.add(a);
		}
		System.out.println(st);
		st.push(31);
		System.out.println(st);
		System.out.println("Popped element:"+st.pop()); //remove last element.
		System.out.println("After pop"+st);
		System.out.println("Peek element"+st.peek());
		
        
	}

}
