package collections;
import java.util.*;
public class probleminteger{
	Scanner obj=new Scanner(System.in);
	void display() {
		int a=obj.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=1;i<=a;i++) {
			int num=obj.nextInt();
			list.add(num);
			System.out.println("input:");
		}
		System.out.println(list);
		int s=list.size();
		if(list.isEmpty()) 
		{
			for(int i=1;i<=4;i++) {
				int list1=obj.nextInt();
				list.add(list1);
			}
			System.out.println(list);
		}
		else if(s%2==0) {
			for(int i=0;i<s;i++) {
				int sq=(int)Math.pow(list.get(i), 2);
				list.add(sq);
			}
			System.out.println(list);
		}
		else {
			System.out.println("done");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        probleminteger p=new probleminteger();
        p.display();
	}

}
