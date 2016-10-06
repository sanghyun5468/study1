package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import study1.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setUp(){
		 cal = new Calculator();
		 System.out.println("before");
	}
	
	@Test
	public void add(){
		assertEquals(9,cal.add(6, 3));
		System.out.println("add");
	}
	
	@Test
	public void subtract(){
		assertEquals(3, cal.subtract(6, 3));
		System.out.println("subtract");
	}
	
	@After
	public void teardown(){
		System.out.println("teardown");
	}
}
