package end;

import java.util.Scanner;

public class sd12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        for (int i = 1; i <= n; i++) 
        {
            for (int s = n; s > i; s--)
            {
                System.out.print("  ");  
            }
            
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++)  
            {
               System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}