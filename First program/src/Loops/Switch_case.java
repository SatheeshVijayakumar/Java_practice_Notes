package Loops;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        System.out.println("5. Modulous");
        
       int a,b,ch;
       Scanner in = new Scanner(System.in);
       System.out.println("enter the Arithmetic operations");
       ch=in.nextInt();
       System.out.println("enter the two Numbers");
       a=in.nextInt();
       b=in.nextInt();
       switch(ch)
       {
       case 1:
          ch=a+b;
          System.out.println("additon is : "+ch);
          break;
       case 2:
           ch=a-b;
           System.out.println("Subtraction is : "+ch);
           break;
       case 3:
           ch=a*b;
           System.out.println("Multiplication is : "+ch);
           break;
       case 4:
           ch=a/b;
           System.out.println("Divison is : "+ch);
           break;
       case 5:
           ch=a%b;
           System.out.println("Modulous is : "+ch);
           break;
           
       default:
    	   System.out.println("invalid key");
          break;
    	   
       }
       
       
       
       
	}

}
