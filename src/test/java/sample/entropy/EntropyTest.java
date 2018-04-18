package sample.entropy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EntropyTest {

	private final double n = 30.0;

	@Test
	void testGetEntropy() {

		// Case1
		assertEquals(-0.0, Entropy.getEntropy(n, n));
		
		// Case2
		assertEquals(0.0, Entropy.getEntropy(0, 0));

		// Case3
		final double[] arg3 = { 12.0, 8.0, 6.0, 4.0 };
		double h3 = 0.0;
		for (double ai : arg3) {
			h3 += Entropy.getEntropy(n, ai);
		}
		assertTrue(h3 > 1.88 && h3 < 1.89);
	}

}
