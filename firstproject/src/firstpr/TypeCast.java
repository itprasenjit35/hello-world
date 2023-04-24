package firstpr;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// widening
		int a=12;
		float f=a;
		
		System.out.println(f);//12
		
		
		short b=14;
		float c=b;
		
		System.out.println(b);//14
		System.out.println(c);//14.0
		
		// narrowing
		
		float l=12.2f;
		int j=(int)l;
		
		System.out.println(l);//12.2
		System.out.println(j);//12
		
		double d=12.55;
		long s=(long)d;
		System.out.println(s);//12
		
		int z=6676;
		byte x=(byte)z;
		System.out.println(x);//it losts data
		
		int y=98;
		char w=(char)y;
		System.out.println(w);// b
		
		char v='A';
		int as=v;
		System.out.println(as);// prints ACSII value of a  65
		
		//equals , contains
		
		String s7="hellojava";
		String s8="hello";
		System.out.println(s7.contains(s8));// true
		
		String s9="hellojava";
		String s1o="hello";
		System.out.println(s9.equals(s1o));  //false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
