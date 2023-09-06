
/*find the factorial of the given number*/
package java_problems;
import java. util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f, i;
		System.out.println("enter the limit");
		Scanner in= new Scanner (System. in);
		int n= in.nextInt();
		f=1;
		for(i=1;i<=n;i++){
			f*=i;
		}
		System.out.println("Factorial of given number n is "+ f);
		
		
		
		// TODO Auto-generated method stub

	}

}
