package java_problems;
import java. util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		int t,i;
		Scanner in= new Scanner (System. in);
		System.out.println("enter the tsble");
	    t=in.nextInt();
	    System.out.println("enter the limit");
		int n=in.nextInt();
		for (i=1;i<=n;i++) {
			System.out.println(t+ "*" +i+ "=" +(t*i));
		}
		// TODO Auto-generated method stub

	}

}
