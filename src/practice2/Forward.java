package practice2;

public class Forward {
	public static void main(String[] arg){
		double t1 = 0.5;
		double t2 = 1.0;
		double t3 = 2.0;
		for(double t = 0; t <= 20; t++) {      
			double error = (ft(t, t1) - f(t)) / f(t);
			System.out.println(error);
		}
		for(double t = 0; t <= 20; t++) {
			double error = (ft(t, t2) - f(t)) / f(t);
			System.out.println(error);
		}
		for(double t = 0; t <= 20; t++) {
			double error = (ft(t, t3) - f(t)) / f(t);
			System.out.println(error);
		}
	}
	public static double f(double t) {      // Ground truth
		double x = Math.pow(Math.E, -1 * t);
		return x;
	}
	public static double ft(double t, double td) {    //Forward Euler
		double x = (1 - td) * f(t - td);
		return x;
	}
}
