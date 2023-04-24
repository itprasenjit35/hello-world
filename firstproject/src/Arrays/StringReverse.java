package Arrays;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello i love java";//output--> java love i hello
		
		System.out.println(a.length());// output--> 17
		
		//split the words n store in arrays
		String words[]=a.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		for(int i=0;i<=0;i++)
		{
			System.out.println(words[i]+" ");
		}
	}
}
