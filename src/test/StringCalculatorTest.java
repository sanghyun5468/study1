package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import study1.StringCalculator;

public class StringCalculatorTest {
	
	StringCalculator cal;
	
	@Before
	public void setUp(){
		cal = new StringCalculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(0, cal.add(""));
		assertEquals(0, cal.add(" "));
		assertEquals(1, cal.add("1"));
		assertEquals(4, cal.add("1,3"));
		assertEquals(8, cal.add("1,3:4"));
		assertEquals(6, cal.add("//;\n1;2;3"));
	}
	
	@Test(expected = RuntimeException.class)
	public void add_negative() throws Exception{
		cal.add("-1,2,3");
	}

 }
