package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Ex5 {
	/**
	 * Create a method which accepts an array of integer elements and return the 
	 * second smallest element in the array
	 * @param args
	 */
	public static int getSecondSmallest (int[] arr)
	{
		//Get the second smallest element in the array 
		ArrayList<Integer> sortedList=new ArrayList<Integer>();
		for(int i:arr)
		{
			sortedList.add(i);
		}
		Collections.sort(sortedList);
		return (int) sortedList.get(1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSecondSmallest(new int[]{5,3,1,2,4}));
	}

}
