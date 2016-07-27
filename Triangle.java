
public class Triangle {
	private double lengthSideA;
	private double lengthSideB;
	private double lengthSideC;

	public Triangle() {
		super();
	}

	public Triangle(double a, double b, double c) {
		super();
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b)))// checking for the
															// correct
															// parameters
		{
			this.lengthSideA = a;
			this.lengthSideB = b;
			this.lengthSideC = c;
		} else

			System.out.println("such triangle doesn't exist");
		;
	}

	public double getLengthSideA() {
		return lengthSideA;
	}

	public void setLengthSideA(double lengthSideA) {
		this.lengthSideA = lengthSideA;
	}

	public double getLengthSideB() {
		return lengthSideB;
	}

	public void setLengthSideB(double lengthSideB) {
		this.lengthSideB = lengthSideB;
	}

	public double getLengthSideC() {
		return lengthSideC;
	}

	public void setLengthSideC(double lengthSideC) {
		this.lengthSideC = lengthSideC;
	}

	public static double calculateArea(Triangle a) {

		double p = (a.lengthSideA + a.lengthSideB + a.lengthSideC) / 2; // calculate
																		// half
																		// of
																		// triangle's
																		// perimeter
		double area = Math.sqrt(p * (p - a.lengthSideA) * (p - a.lengthSideB) * (p - a.lengthSideC));
		return area;

	}

}
