package jUnitTests;
import clase.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clase.Ferestre;

class Teste2 {

		//lista[1]=fer;
		
		
		//@Test
	/*	public void test() {
			double incercare = fer.calcSuprafata();
			assertEquals(incercare,12,1);
	}*/
		@Test
		public void test2() {
			Suprafata array[] = new Suprafata[5];
		array[0] = new Usi(4,2,null);
		array[1] = new Ferestre(3, 4, null);
		array[2] = new Perete(9,3,null);
		array[3] = new Perete(9,6,null);
		array[4] = new FereastraRotunda(3);
		//FereastraRotunda ferrot = new FereastraRotunda(3);
		//array[0]=usi;
		double expected = ToataSuprafata.calculateSuprafataOpaca(array);
		assertEquals(expected,32.72566604614258,0);
		
		}

}
