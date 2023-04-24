package UserIn;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculating your percentage");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter marks of eng");
		int a=sc.nextInt();
		
		System.out.println("enter marks of math");
		int b=sc.nextInt();

		System.out.println("enter marks of bio");
		int c=sc.nextInt();
		
		System.out.println("enter marks of phy");
		int d=sc.nextInt();
		
		System.out.println("enter marks of chem");
		int e=sc.nextInt();

		float sum=(a+b+c+d+e)/5;
		
		System.out.println(" your percentage is ");
		System.out.println(sum);


		if(sum>=66)
		{
			System.out.println("congratulation you are passed in destinction");

		}
		else
		{
			if(sum<66&&sum>50)
			{
				System.out.println(" passed in first class ");

			}
			else
			{
				if(sum>40&&sum<50)
				{
					System.out.println(" passed in second class    ");

				}
				else
				{
					System.out.println("  you are fail!!      ");

				}
			}
		}


	}

}
