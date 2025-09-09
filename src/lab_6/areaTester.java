package lab_6;

public class areaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Campsite camp = new Campsite(10.0);
		Trail fail = new Trail(25.0, 6.0);
		System.out.print(camp.area() + fail.area());
	}

}
