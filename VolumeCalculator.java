public class VolumeCalculator{
	public static void volumeOfCube(double side)
	{
		double volume=side*side*side;
		System.out.println("Volume:" +volume);
	}
	public static void main(String[] args)
	{
		volumeOfCube(4.0);
	}
	}