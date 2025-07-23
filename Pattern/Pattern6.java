// Inverted Right Pyramid
// Input: Enter the number= 6
// Output:
// * * * * * *
// * * * * * 
// * * * * 
// * * * 
// * * 
// *

import java.util.*;
public class Pattern6 {
    public static void main(String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
