package firstpr;

public class mainclass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//double a=10.89;
		//double b=21.65;
		//double sum=b-a;
		
		String e= "How are You?";
		
		//System.out.println(sum);
		//System.out.println("this is total");
		System.out.println(e);
		
		System.out.println(e.length());  //length of string
		
		System.out.println(e.toUpperCase());  //converted to upper case
		
		System.out.println(e.toLowerCase());  //converted to lower case
		
		System.out.println(e.charAt(5));  //this will give specific character 
		
		String f="hello";
		String g="java";
		
		System.out.println(f+" "+g);  //using + operator
		
		System.out.println(f.concat(" "+g));  //using concat method
		
		
	    //escape character
		
		String p="i \"love\" java";
		
		System.out.println(p);
		
		String q="i love \"backslash\" \\ character";
		
		System.out.println(p+" "+q);
		
		String r="  how  are  ";
		System.out.println(r.trim());//leftand right spaces removed
		
		String s1="hello";
		String s2="Hello";
		//equals , contains , equalIgnoreCase
		System.out.println(s2.equalsIgnoreCase(s1));
		
		//substring
		
		String s4="i love java";
		System.out.println(s4.substring(4)); //begin index  ve java
		
		System.out.println(s4.substring(2, 6));//endindex-1    love
		
		System.out.println(s4.substring(0, 6));// i love
		
		
		
		
		
	}

	

}
