package collections;
import java.util.ArrayList;
public class Add {
		boolean isPrime(int num) {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		ArrayList<Integer> primeBwRange(int st,int ed) {
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=st;i<=ed;i++) {
				if(isPrime(i)) {
					al.add(i);
				}
			}
			return al;
		}
	public static void main(String[] args) {
		Add sv=new Add();
		ArrayList<Integer> a=sv.primeBwRange(10, 20);
		System.out.println(a);
	}
}

// add set remove 
