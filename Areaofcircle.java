package sept2023to200;

public class Areaofcircle
{
	// Java Program to demonstrate Class Variable
	
		// class variable
		private static final double PI = 3.14159;
		private double radius;
		public Areaofcircle(double radius) 
		{ this.radius = radius; }
		public double getArea() 
		{ return PI * radius * radius; }
		public static void main(String[] args)
		{
			Areaofcircle obj = new Areaofcircle(5.0);
			System.out.println("Area of circle: "
							+ obj.getArea());
		}
	}



