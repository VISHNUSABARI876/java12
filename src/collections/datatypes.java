package collections;

public class datatypes {

	public static void main(String[] args) {
		int num=10225;
		String st=String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		sb.append(st);
		System.out.println(sb.reverse());
		Integer nu=Integer.valueOf(num);
		float f=20.25f;
		float fl=Float.valueOf(f);
		st=sb.toString();
		Integer rs=Integer.parseInt(st);
		System.out.println(rs);

	}

}
