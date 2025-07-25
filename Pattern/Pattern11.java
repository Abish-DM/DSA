// Binary Number Triangle Pattern
// Input: Enter the number= 6
// Output:   
// 1
// 01
// 101
// 0101
// 10101
// 010101

import java.util.*;
public class Pattern11 {
    public static void main (String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int c = (i % 2 == 0) ? 0 : 1;
            for (int j=0;j<i;j++){
                System.out.print(c);
                c=(c==1)?0:1;
            }
            System.out.println();
        }
    }
}
