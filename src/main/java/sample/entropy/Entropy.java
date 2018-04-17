package sample.entropy;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.google.common.base.Preconditions;

public class Entropy {
	
	private static final int DECIMAL_PLACE = 4;

	private static double log2(double a) {
		return Math.log(a) / Math.log(2);
	}

	public static BigDecimal getEntropy(double n, double ai) {
		Preconditions.checkNotNull(n, ai);
		final double pi = ai / n;
		final BigDecimal h = BigDecimal.valueOf(-pi * log2(pi))
				.setScale(DECIMAL_PLACE, RoundingMode.HALF_UP);
		return h;
	}
}
