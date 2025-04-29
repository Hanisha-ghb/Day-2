public class AverageCalculator{
	public static void averageOfThreeNumbers(double a, double b, double c)
	{
		double average=(a+b+c)/3;
		System.out.println("Average:" +average);
	}
	public static void main(String[] args)
	{
		averageOfThreeNumbers(10.0, 20.0, 30.0);
	}
	}