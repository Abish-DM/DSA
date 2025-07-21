import java.util.*;
class Pattern2 {
    public static void main(String [] abi){
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.print("Enter the value of N :");
        N=sc.nextInt();
        for(int i=0; i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
