package FlowControl_Operators;

public class Ex6 {

	public static int calculateDifference(int n)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1+=i*i;
		}
		sum2=n*(n+1)/2;
		return Math.abs(sum2*sum2-sum1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateDifference(10)); 
	}

}
