package jUnitTests;
import clase.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Teste1 {
Ferestre fer = new Ferestre(3, 4, null);
	@Test
	public void test() {
		double incercare = fer.calcSuprafata();
		assertEquals(incercare,12,0);
	}

}
