//Right-Angled Number Pyramid
// Input: Enter the number: 6
// Output:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6

import java.util.*;
public class Pattern3 {
    public static void main(String[] abish){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int c = 1;  // Reset each row
            for(int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        sc.close();
    }
}
