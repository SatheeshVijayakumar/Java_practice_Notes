package Loops;
import java.util.Scanner;

public class group_switch_case {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stu
		
		char c;
		
		Scanner ins = new Scanner(System.in);
		 System.out.println("enter the character ");
		c=ins.next().charAt(0);
		switch(c)
		{
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("this character is  a vowel");
			 
	     break;
	     
	   default:
		   System.out.println("this character is not a vowel");
		 
		   break;
		   
		}
			
			
		
		
		

	}

}
