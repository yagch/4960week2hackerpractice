package practice1;

public class Function2Eq2 {
	public static void main(String[] args) {
		double h = 0.1;
		for(int i = 0; i < 18; i++) {
			double fd = (f2(1.0 + h) - f2(1.0 - h)) / (2 * h) + h * h;
			double error = (fd - 2.0) / 2.0;
			System.out.println(error);
			h *= 0.1;
		}
	}
	public static double f2(double x) {
		double n = 1.0;
		for (int i = 0; i < 8; i++) {
			n *= 10.0;
		}
		double fx = x * x + n;
		return fx;
	}
}
