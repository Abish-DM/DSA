// Inverted Numbered Right Pyramid
// Input: Enter the number = 6
// Output:
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2 
// 1

import java.util.*;
public class Pattern5 {
    public static void main(String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt(),c=1;
        for (int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
            c=1;
        }
    }
}
