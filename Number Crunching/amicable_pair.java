import java.util.*;
public class amicable_pair
{
    public static void main(String abi[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),a1=0,a2=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                a1+=i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                a2+=i;
            }
        }
        System.out.print(a1==b && a2==a ? "Amicable Pair" : "Not Amicable Pair");
    }
}