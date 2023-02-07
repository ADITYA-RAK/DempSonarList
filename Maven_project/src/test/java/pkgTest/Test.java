package pkgTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import pkgCalculator.Calculator;

public class Test {
	public static Calculator objCalculator;

	@Before

	public void setup() throws Exception {
		objCalculator=new Calculator();
	}

	@After

	public void tearDown() throws Exception {

	System.out.println("closing ");
	}

	
	public void additionTest() {
		assertEquals(25,objCalculator.addition(12, 13));
	}
		
	public void substractionTest() {
		assertEquals(-1,objCalculator.substraction(12,13));
	}

	
	public void multiplyTest() {
		assertEquals(156,objCalculator.multiply(12, 13));
	}
	
	public void divisionTest() {
		assertEquals(0,objCalculator.division(12, 13));
	}
}