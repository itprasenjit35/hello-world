package Arrays;

public class twoDimentionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{20,30,40,50},
				    {21,22,23,24}};
		
		/* System.out.println(a.length);// 2
		
		System.out.println(a[0].length);// 4
		
		System.out.println(a[1].length);// 6
		
		System.out.println(a[1][2]);// row 1 column 2 -->23  */
		
		for(int i=0;i<a.length;i++)// outer loop
		{
			for(int j=0;j<a[i].length;j++)// inner loop
			{
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}

}
