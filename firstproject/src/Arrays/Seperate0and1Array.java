package Arrays;

import java.util.Arrays;

public class Seperate0and1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,1,0,1,0,1,0,1,0};
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count++;
				
			}
		}
		for(int i=0;i<count;i++)
		{
			a[i]=0;
			
		}
		
		for(int i=count;i<a.length;i++)
		{
			a[i]=1;
			
		}
		System.out.println(Arrays.toString(a));//seperates o and 1 and print it
		
	}

}
