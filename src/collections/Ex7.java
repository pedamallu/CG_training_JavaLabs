package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex7 {
	/**
	 * Create a method which accepts an integer array, reverse the numbers 
	 * in the array and returns the resulting array in sorted order
	 * @param args
	 */
	public static ArrayList<Integer> getSorted(int[] arr)
	{
		ArrayList<Integer> reversedArr=new ArrayList<Integer>(arr.length);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			String temp=Integer.toString(arr[i]);
			StringBuilder str=new StringBuilder(temp);
			str.reverse();
			reversedArr.add(Integer.parseInt(str.toString()));
		}
		Collections.sort(reversedArr);
		return reversedArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSorted(new int[] {321,432,561}));
	
	}

}
