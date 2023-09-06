package java_problems;
import java. util.Scanner;

public class Factor_givennumbers {

	public static void main(String[] args) 
	{
		int i,n;
		
		Scanner in= new Scanner (System. in);
		System.out.println("enter the limit");
	    n=in.nextInt();
	    for(i=1;i<=n;i++) {
	    	if(n%i==0) {
	    		System.out.println("The factor of given number  is"+ i);
	    }
	    }
	   
		// TODO Auto-generated method stub

	}

}
