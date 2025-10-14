package Stringbasics;

public class stringdelete {

	public static void main(String[] args) {
        String str="Kavin";
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        sb.append(" Kumar is a good boy");
        System.out.println(sb);
        sb.delete(6, 11);       //delete a one or more letter in a string.
        System.out.println(sb);
        sb.insert(6,"Kumar");
        System.out.println(sb);
        
	}

}
