// Input: Enter the number= 3
// Output: 
//   *  
//   **
//   ***  
//   **
//   * 

import java.util.*;
public class Pattern10 {
    public static void main(String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
