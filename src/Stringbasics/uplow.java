package Stringbasics;
public class uplow {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="ViShNu";
        String res="";
        for(int i=0;i<str.length();i++) {
        char ch=str.charAt(i);
        if(ch>=97&&ch<='z') {
             ch=(char)(ch-32);
        }
        else if(ch>=65&&ch<='Z') {
        	ch=(char)(ch+32);
        }
        res=res+ch;
        }
        System.out.println(res);
        String rev="";
        for(int i=res.length()-1;i>=0;i--) {
        		rev=rev+res.charAt(i);
       	}
        System.out.println(rev);
	}
}
