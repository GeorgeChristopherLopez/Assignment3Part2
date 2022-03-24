package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {


	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(10,2);
		
		assertEquals(5, output, 0.001);
	}
	@Test
	public void test2() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(10,0);
		
		assertEquals(0, output, 0.001);
	}


}
