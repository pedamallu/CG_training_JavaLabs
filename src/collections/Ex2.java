package collections;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
	/**
	 * Create a method that accepts a character array and count the number of times
	 * each character is present in the array.
	 * @param arr
	 * @return
	 */
	public static Map<Character, Integer> countChars(char[] arr)
	{
		Map<Character, Integer> hm= new HashMap<Character, Integer>();
		for(char item:arr)
		{
			if(hm.containsKey(item))
				hm.put(item, hm.get(item)+1);
			else
				hm.put(item, 1);
		}
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','p','p','l','e'};
		System.out.println(countChars(arr));
	}

}
