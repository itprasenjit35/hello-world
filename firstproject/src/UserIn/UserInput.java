package UserIn;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter first number");
		int a=sc.nextInt();
		
		System.out.println("enter second number");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("a is greater");

		}
		else
		{
			System.out.println("b is greater  ");

		}
		

	}

}
