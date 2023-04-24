package firstpr;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Addition
		
		int a=10;
		int b=20;
		//int c=a+b;
		System.out.println(b+a);
		
		//Remainder
		
		int d=98;
		int e=10;
		int k=d%e;
		System.out.println(k);
	
		//Assignment operator =
		// comparison 
		//<,>,<=,>=,==,!=
		
		int x=10;
		int y=20;
		System.out.println(x<y);//true
		System.out.println(x>y);//false
		System.out.println(x>=y);//false
		System.out.println(x<=y);//true
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		
		// logical 
		//And &&   if both statements are true--> true 
		//Or ||   if one statement is true --> true
		//Not !   reverse the result--> 
		
		int z=10;
		System.out.println(z<30&&z>30);//false
		System.out.println(z>5||z<6);//true
		System.out.println(!(z<30&&z>30));//true
		
		
		//pre increment
		int p=10;
		System.out.println(++p);
		System.out.println(p);
		
		//post increment
				
		int r=20;
		System.out.println(r);
		System.out.println(r++);
		
		

		

		
		



		
		
		
		
	}

}
