package sample.entropy;

public class Entropy {
	
	private static double log2(double a) {
		return Math.log(a) / Math.log(2);
	}

	public static double getEntropy(double n, double ai) {
		if(0.0 == n && 0.0 == ai) {
			return 0.0;
		}
		final double pi = ai / n;
		final double h = -pi * log2(pi);
		return h;
	}
}
