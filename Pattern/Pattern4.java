// Right-Angled Number Pyramid - II
// Input: Enter the number= 6
// Result:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 6 6 6 6 6 6

import java.util.*;
public class Pattern4 {
    public static void main(String[] abish){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
