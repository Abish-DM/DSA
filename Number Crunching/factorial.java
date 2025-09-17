import java.util.*;
public class factorial
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        if(n!=i){
		          System.out.print(i+",");
                }
		        else{
		          System.out.print(i);
                }
		    }
		}
	}
}