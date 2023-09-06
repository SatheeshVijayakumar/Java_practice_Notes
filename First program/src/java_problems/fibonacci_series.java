package java_problems;
import java. util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		int i, n, a, b, c;
		System.out.println("enter the limit");
		Scanner in= new Scanner (System. in);
		n=in.nextInt();
		a=-1;b=1;
		for(i=1;i<=n;i++) {
			c=a+b;
			System.out.println(+ c);
			a=b;
			b=c;
		}
		// TODO Auto-generated method stub

	}

}
