package ifelse;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int marks=90;
		if(marks>90) {
			System.out.println("distinction");
		}
		else if(marks>70&&marks<=90) {
			System.out.println("first class");
		}
		else if(marks>50&&marks<=70) {
			System.out.println("second class");
		}
		else {
			System.out.println("fail");
		}
	}

}
