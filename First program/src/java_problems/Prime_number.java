package java_problems;
import java. util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
	int i,n, f=0;
   Scanner in= new Scanner (System. in);
	System.out.println("enter the limit");
    n=in.nextInt();
    for(i=1;i<=n;i++) {
    	if(n%i==0) {
    		f++;
		 }
    	}
    if(f==2) {
    	System.out.println("the given number is prime number");
    }
    else {
    	System.out.println("the given number is not an  prime number");
    	
    }
	}
}
