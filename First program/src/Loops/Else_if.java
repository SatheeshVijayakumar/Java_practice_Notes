/*
Else If Ladder
90-100 Grade-A
80-89  Grade-B
70-79  Grade-C
<70    Grade-D
*/

package Loops;

import java.util.Scanner;

public class Else_if {
	
	    
	    public static void main(String[] args) {
	   float mark;
	    System.out.println("Enter the average mark");
		Scanner in = new Scanner(System.in);
		mark= in.nextFloat();
		if(mark >= 90 && mark <= 100)
		{
			System.out.println("Grade A");
		}
		else if (mark>=80 && mark<=89)
		{
			System.out.println("Grade B");
		}
		else if (mark>=70 && mark<=79)
		{
			System.out.println("Grade c");
		}
		else
		{
			System.out.println("Grade D");
		}
		}

}
