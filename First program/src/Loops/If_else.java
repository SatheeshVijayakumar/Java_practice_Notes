package Loops;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("enter the age");
		Scanner in = new Scanner(System.in);
		age=in.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligible for vote");
			}
		else
		{
			
			System.out.println("you are not eligible for vote");
		}
		
	
		

	}

}
