package Array;

import java.util.Arrays;

public class insert_element {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[]= {10,20,25,30,35,40,45,50,55,60};
		int index = 2;
		int value = 5;
		System.out.println("before  :" +Arrays.toString(a));
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println("after insert an element : "+Arrays.toString(a));
		

	}

}
