package methods;
import java.util.Scanner;
public class sumofPrime {
	boolean isPrime(int num) {

		for(int i=2;i<=num/2;i++) {

			if(num%i==0) {

				return false;

			}

		}

		return true;

	}

	int primeSum(int st,int ed) {

		int sum=0;

		for(int i=st;i<=ed;i++) {

			if(isPrime(i)) {

				sum=sum+i;

			}

		}

		return sum;

	}

	public static void main(String[] args) {

		sumofPrime sv=new sumofPrime();

		int res=sv.primeSum(10, 20);

		System.out.println(res);

		res=sv.primeSum(50, 70);

		System.out.println(res);

	}

}
