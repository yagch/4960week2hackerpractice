package practice1;

public class Function1Eq2 {
	public static void main(String[] args) {
		double h = 0.1;
		for(int i = 0; i < 18; i++) {
			double fd = (f1(1.0 + h) - f1(1.0 - h)) / (2 * h) + h * h;
			double error = (fd - 2.0) / 2.0;
			System.out.println(error);
			h *= 0.1;
		}
	}
	public static double f1(double x) {
		double fx = x * x;
		return fx;
	}
}
