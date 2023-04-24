package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> obj = new HashSet<Integer>();  // sequence is not fix  // duplicate isnot allowed
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);

		System.out.println(obj);
		
		obj.remove(40); //Removes the specified element from this set if it is present
		
	//	obj.clear();  // clear the hashset
		
		obj.contains(30);
		
	//	obj.clone();
		
		
		// foe each loop
		for(int j:obj)
		{
			System.out.println(j);

		}
		
		
		
	}

}
