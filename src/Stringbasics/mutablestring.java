package Stringbasics;  
public class mutablestring {

	public static void main(String[] args) {
		// TODO Auto-gener
		String str="Kavin";
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(str);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Kumar is a good boy");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		

	}

}
