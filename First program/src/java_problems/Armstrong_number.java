package java_problems;
import java. util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		int digit1,digit2,digit3,temp,number,result;
		System.out.println("enter the limit");
		Scanner in= new Scanner (System. in);
		number=in.nextInt(); //123
		temp=number; 
		digit1= temp%10; //3
		temp=temp/10;    //12
		digit2= temp%10;  //2
		temp=temp/10;   //1
		digit3= temp%10;  //1
		result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		if(number==result) {
			System.out.println("the given number is Armstrong number :"  +result);
		}
		else {
			System.out.println("the given number is not an Armstrong number");
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
