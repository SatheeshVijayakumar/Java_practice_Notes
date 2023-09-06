package Loops;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		System.out.println("enter the limit");
		
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		
		
		
		

	}

}
