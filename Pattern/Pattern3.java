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
