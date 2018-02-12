package practice3;

public class Eq7 {
	public static void main(String[] arg) {
		double h = 0.5;
		for(int i = 0; i < 40; i++) {
			if (i >= 3) {
				System.out.println((ah(4 * h) - ah(2 * h)) / (ah(2 * h) - ah(h)));
			}
			h /= 2;
		}
	}
	public static double ah(double h) {
		return (f(1 + h) - f(1)) / h;
	}
	public static double f(double x) {
		return x * x * x;
	}
}
