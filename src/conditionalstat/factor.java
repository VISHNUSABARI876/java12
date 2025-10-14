package conditionalstat;
public class factor {
     public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int n=24;
	  int count=0;
      for(int i=1;i<=n;i++) {
    	  if(n%i==0) {
    		  System.out.println(i);
    		  count++;
    	  }  
      }
	  System.out.println("Number of factors :"+count);
	}
}
