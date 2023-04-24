package collections;


import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <Integer> obj = new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);  // add the values in arrays
		obj.add(30);
		obj.add(40);
		obj.add(70);
		
		System.out.println(obj);
		
		obj.remove(2);// remove at index 2
		
		System.out.println(obj);
		
		obj.add(3, 50);  // insert 50 at index 3
		
		System.out.println(obj);
		
		obj.set(3, 60);    // replace the value
		
		System.out.println(obj);

		// obj.clear(); // to clear the list
		
		
		
		System.out.println(obj.contains(40)); // Returns true if this list contains the specified element
		
		for(int a:obj)
		{
			System.out.println(a);
	
		}
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
			
		}
		
		


		
	
	}

}
