// Inverted Star Pyramid
// Input: Enter the number= 3
// Result: 
// *****  
//  ***
//   *  

import java.util.*;
public class Pattern8 {
    public static void main(String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt();
        for(int i=n; i>=1;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
