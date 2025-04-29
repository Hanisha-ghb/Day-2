public class SimpleInterestCalculator{
	public static void calculateSimpleInterest(double principal, double rate, double time)
	{
		double simpleinterest=((principal * rate * time)/100);
		System.out.println("Simple Interest:" +simpleinterest);
	}
	public static void main(String[] args)
	{
		calculateSimpleInterest(1000.0, 5.0, 2.0);
	}
	}