package sample;

import java.math.BigDecimal;
import java.math.RoundingMode;

import sample.entropy.Entropy;

public class Application {

	private static final double EXPECTED_VALUE = 1.889;
	
	public static void main(String[] args) {
		final double n = 30.0;
		final double a[] = { 12.0, 8.0, 6.0, 4.0 };
		BigDecimal h = new BigDecimal(0.0);

		for (double ai : a) {
			h = h.add(Entropy.getEntropy(n, ai));
		}
		
		if (EXPECTED_VALUE == h.setScale(3, RoundingMode.HALF_UP).doubleValue()) {
			System.out.println("success");
		}
	}

}
