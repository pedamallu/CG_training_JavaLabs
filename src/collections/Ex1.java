package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {
	/**
	 * Create a method which accepts a hash map and return the values 
	 * of the map in sorted order as a List.
	 * @param hm
	 * @return List
	 */
	public static List getValues(HashMap<String, Integer> hm)
	{
		//Return a list of sorted values from hash map
		List<Integer> list=new ArrayList<>( hm.values());
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("One", 1);
		hm.put("Three", 3);
		hm.put("Two", 2);
		//System.out.println(hm.get("Four"));
		System.out.println(getValues(hm));
	}

}
