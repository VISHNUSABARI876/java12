import java.util.Arrays;

public class stringbasics {
    public static void main(String[] args) {
         String str1="Vecna";
         String str2=new String("Vecna");
         String str3="Vecna";                       //variable1.equals(variable2).
         String str4=new String("Vecna");           //variable1.equalsIgnoreCase(variable2).
         System.out.println(str1==str2);
         System.out.println(str1==str3);
         System.out.println(str2==str4);
         System.out.println(str1.equals(str4));   //compare string.
         char ch[]= {'a','b','c','r','f'};
         String arr[]= {"a","b","c","r","g"};
         System.out.println(ch);
         System.out.println("...............");
         System.out.println(arr);      //prints the memory address
         
         
	}

}
