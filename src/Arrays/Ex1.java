package Arrays;
import java.util.Arrays;
public class Ex1 {

	public static int getSecondSmallest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,6,1,5,8};
		//System.out.println(getSecondSmallest(arr));
	}

}
class Test
{
	static public void main(String[] args)
	 {
		 System.out.println(args.length);

	 }
}