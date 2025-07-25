// Number Crown Pattern
// Input: Enter the number= 3
// Output: 
// 1    1
// 12  21
// 123321

import java.util.*;
public class Pattern12 {
    public static void main(String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
