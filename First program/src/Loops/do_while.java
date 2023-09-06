package Loops;
import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the limit");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int i = 2;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=n);
		
		
	
	}

}
