package Arrays;

import java.util.Arrays;

public class SingleDimentionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to store multiple values in variable
		
		int a[]= {10,20,30,40};
		System.out.println(a.length);
		System.out.println(a[2]);// to print value at specific location
		
		//way to print array
		System.out.println(Arrays.toString(a));
		
		a[2]=50; // 50 assigned to replace 30
		
		System.out.println(Arrays.toString(a));

		// using for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
			
		}
		
		for(int k:a)
		{
			System.out.println(k);
		}
		
		
		//declare string type arrays
		
		String [] p= {"prasen","ravi","madhu"};
		
		System.out.println(Arrays.toString(p));
		
		// for loop
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
		//for each
		
		for(String v:p)
		{
			System.out.println(v);
		}
	}
	

}
