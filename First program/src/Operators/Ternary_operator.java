package Operators;

public class Ternary_operator {

	public static void main(String[] args) {
		
		int a=11,b=12,c;
		
		c=a>b?a:b;
		System.out.println("the greatest number is : " +c );
		
		/*The conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions.
		 *  When using a Java ternary construct, only one of the right-hand side expressions, i.e. 
		 *  either expression1 or expression2, is evaluated at runtime.Condition? expression1: expression2;
		 

               if condition is true, expression1 is executed.
               And, if condition is false, expression2 is executed.
               This Java program demonstrates the use of the conditional operator (also known as the ternary operator) ?:. 
               The program defines two integer variables a and b with values of 45 and 35, respectively.

             The program then uses the conditional operator ?: to check which of the two variables a and b is greater.
              If a is greater than b, the value of c is set to a. Otherwise, the value of c is set to b. 
		     Finally, the program prints the value of c as the greatest number among a and b. Since a is greater than b, 
		     the value of c is set to a, which is 45. 
             Therefore, the program prints "The Greatest Number is : 45". */
				
		// TODO Auto-generated method stub

	}

}
