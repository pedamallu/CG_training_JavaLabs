package collections;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {

	/**
	 * Create a method which accepts an array of numbers and returns 
	 * the numbers and their squares in Hashmap.
	 * @param args
	 */
	public static Map getSquares(int[] arr)
	{
		Map<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int i:arr)
			hm.put(i, i*i);
		return hm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,2,7};
		System.out.println(getSquares(arr));
		}
	}
