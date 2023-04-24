
public class MethodOverloading {

	
	public void Adition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void Adition(double c, double d, double e)
	{
		System.out.println(c+d+e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.Adition(12, 23, 45);
		obj.Adition(43,54);
		
	}

}
