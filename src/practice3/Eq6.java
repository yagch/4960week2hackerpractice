package practice3;

public class Eq6 {
	public static void main(String[] arg) {
		double h = 0.5;
		for(int i = 0; i < 40; i++) {
			if (i >= 3) {
				System.out.println(e2h(h) / eh(h));
			}
			h /= 2;
		}
	}
	public static double eh(double h) {
		return 3 - (f(1 + h) - f(1)) / h;
	}
	public static double e2h(double h) {
		return 3 - (f(1 + 2 * h) - f(1)) / (2 * h);
	}
	public static double f(double x) {
		return x * x * x;
	}
}
