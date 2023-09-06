package java_problems;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		int i,n, sum=0,result;
		   Scanner in= new Scanner (System. in);
			System.out.println("enter the limit");
		    n=in.nextInt();
		    for(i=1;i<n;i++) {
		    	if(n%i==0) {
		    		sum+=i;
				 }
		    	}
		    if(sum==n) {
		    	System.out.println("the given number is perfect number");
		    }
		    else {
		    	System.out.println("the given number is not an  perfectnumber");
		    	
		    }
			
		// TODO Auto-generated method stub

	}

}
