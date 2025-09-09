package lab_6;

public class Automobile {
	private String make;
	private String model;
	private double mileage;
	private double fuelTank;
	private double fuel = fuelTank;
	Automobile(String mk, String mdl, double m, double fT)
	{
		make = mk;
		model = mdl;
		mileage = m;
		fuelTank = fT;
	}
	public void fillUp(double gallons)
	{
		if (fuel + gallons <= fuelTank)
		{
			fuel = gallons + fuel;
		}
		else
		{
			fuel = fuelTank;
		}
			
	}
	public void takeTrip(double miles)
	{
		fuel = fuelTank - (miles / mileage);
	}
	public double reportFuel()
	{
		return fuel;
	}
}
