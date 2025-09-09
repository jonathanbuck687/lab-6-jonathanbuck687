package lab_6;

public class Trail {
	private double length;
	private double width;
	public double area()
	{
		return length * width;
	}
	public double perimeter()
	{
		return (length * 2) + (width * 2);
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double u)
	{
		width = u;
	}
	public Trail(double l, double u)
	{
		length = l;
		width = u;
	}
}
