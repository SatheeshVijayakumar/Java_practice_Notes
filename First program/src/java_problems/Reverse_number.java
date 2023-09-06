package java_problems;
import java. util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		int i, n, reverse=0,rem;
		System.out.println("enter the limit");
		Scanner in= new Scanner (System. in);
		n=in.nextInt();
		while(n!=0) {
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
		}
		System.out.println("the reverse of given number is :  "  + reverse);
		// TODO Auto-generated method stub

	}

}
