package lab_6;

import java.lang.Math;
public class Campsite {
	private double radius;
	public double area()
	{
		return radius * radius * Math.PI;
	}
	public double perimeter()
	{
		return 2 * radius * Math.PI;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	public Campsite(double r)
	{
		radius = r;
	}
}
