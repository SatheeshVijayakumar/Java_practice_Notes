package Array;
import java.util.Scanner;

public class count_odd_even {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		int o=0, e=0,n,i;
		System.out.println("Enter The Limit : ");
		Scanner in = new Scanner ( System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			System.out.println("enter the number :"  +i);
			a[i]=in.nextInt();
		}
		for (int element :a) {
			if(element%2==0) {
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("the even number is :"  +e);
		System.out.println("the even number is :"  +o);
		

	}

}
