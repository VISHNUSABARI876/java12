package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class problemstring {
	Scanner obj=new Scanner(System.in);
	void display() {
		int a=obj.nextInt();
		ArrayList<String> list=new ArrayList<>();
		for(int i=1;i<=a;i++) {
			String str=obj.next();
			list.add(str);
			System.out.println("input:");
		}
		System.out.println(list);
		int s=list.size();
		if(list.isEmpty()) {
			for(int i=1;i<=4;i++) {
				String list1=obj.next();
				list.add(list1);
			}
			System.out.println(list);
		}
		else if(s%2==0) {
			for(int i=0;i<s;i++) {
				String  sq=list.get(i);
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
        problemstring p=new problemstring();
        p.display();
	}

}
