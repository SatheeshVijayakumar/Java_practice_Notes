package Array;
import java.util.Scanner;

public class single_dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,25,30,35,40,45,50,55,60,65};   //accessing array
		System.out.println(a[1]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
		 //Print all Elements using Enhanced for loop
		
		for(int b:a) {
			System.out.println(b);
		}

	}	

}
