/* find the sum & avg of given number */


package java_problems;
import java. util.Scanner;

public class sum_avg {

	public static void main(String[] args) {
	    int i,n,sum=0, a;
		Scanner in= new Scanner (System. in);
		System.out.println("enter the limit");
		n= in.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("enter the numbers");
			a=in.nextInt();
			sum+=a;
		}
		System.out.println("the sum of given number is :"  +sum);
		System.out.println("the sum of given number is :"  +sum/n);
		
		// TODO Auto-generated method stub

	}

}
