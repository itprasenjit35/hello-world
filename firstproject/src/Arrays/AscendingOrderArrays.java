package Arrays;

public class AscendingOrderArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {20,40,50,30,10};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(a[1]);// second smallest number in arrays
		
		System.out.println(a[a.length-2]);// second largest number
		
		System.out.println(a[0]);//most smallest number
		
		System.out.println(a[a.length-1]);// most largest number
		
		
		
	}

}
