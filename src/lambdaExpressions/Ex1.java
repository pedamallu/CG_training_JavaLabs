package lambdaExpressions;

@FunctionalInterface
interface MathOp//Functional interface for x^y
{
	double xPowery(int x,int y);
}


public class Ex1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lambda Expression for the X power y
		MathOp power=(int x,int y)->Math.pow(x, y);
		System.out.println(power.xPowery(5, 2));
	}

}
