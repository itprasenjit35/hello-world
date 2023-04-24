package firstpr;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to print etring as a reverse rahul--> luhar
		
		
		String s="Rahul";
		String temp="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			temp=temp+s.charAt(i);
			
		System.out.println(temp);
		
		}
		
	}
	

}
