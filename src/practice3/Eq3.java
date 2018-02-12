package practice3;

public class Eq3 {
	public static void main(String[] arg) {
		double h = 0.5;
		for(int i = 0; i < 40; i++) {
			if (i >= 3) {
				System.out.println(((f(1 + h) - f(1)) / h - 3) / 3);
			}
			h /= 2;
		}
	}
	public static double f(double x) {
		return x * x * x;
	}
}
