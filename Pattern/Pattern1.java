import java.util.Scanner;
class Main {
    static void pattern1(int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int N=sc.nextInt();
        pattern1(N);
    }
}