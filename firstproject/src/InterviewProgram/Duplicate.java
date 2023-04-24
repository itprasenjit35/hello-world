package InterviewProgram;
import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String e ="kjhkjkhlk";
		
		char ch[]=e.toCharArray();
		
		HashSet<Character> hs =new HashSet<Character>();
		
		for(char b:ch)
		{
			hs.add(b);
		}
		
	}

	

}
