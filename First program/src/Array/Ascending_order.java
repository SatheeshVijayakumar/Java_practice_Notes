package Array;

import java. util.Arrays;

public class Ascending_order {

	public static void main(String[] args) {
		
		int a[]= {10,3,5,50,40,25,35,11,1,0};
		int temp =0;
		System.out.println("before :"+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i] = a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		System.out.println("after :"+Arrays.toString(a));
		// TODO Auto-generated method stub

	}

}
