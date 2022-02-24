package Arrays;
import java.util.*;
public class Ex4 {

	public static int[] modifyArray(int[] arr)
	{
		Set<Integer> set=new HashSet<Integer>();
		for(int i:arr)
			set.add(i);
		int[] sol=new int[set.size()];
		int ind=0;
		for(int i:set)
		{
			sol[ind]=i;
			ind++;
		}
		ind=0;
		Arrays.sort(sol);
		for(int i=sol.length-1;i>=0;i--)
		{
			arr[ind]=sol[i];
			ind++;
		}
		return Arrays.copyOfRange(arr, 0, ind);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,2,3,4,4,1};
		System.out.println(Arrays.toString(modifyArray(arr)));
	}

}
