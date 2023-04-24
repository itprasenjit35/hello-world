package JavaBasics;

public class Basics {

	// non static method
	public void method1()
	{
		System.out.println("hello this is method 1");
	}
	// parameterized method
	public static void method2(int a,int b)// static method
	{
		System.out.println(a+b);
	}
	
	// method with return type
	public int method3()
	{
		int i=9;
		return i;
		
	}
	
	public static void main(String[] args) // static method
	{
		// we need to create object of class
		//classname obj=new classname();
		
		Basics obj =new Basics();// object created of class
		obj.method1(); //object of method for calling 
		method2(10, 20); // method calling of static method
		System.out.println(obj.method3());
		
			
	}
	

}
