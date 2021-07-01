//package Lab3_JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

	private GradeBook gb1;
	private GradeBook gb2;
	
	@Before
	public void setUp() throws Exception {
		
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(1.1);
		gb1.addScore(2.2);
		gb1.addScore(3.3);
		gb1.addScore(4.4);
		gb1.addScore(5.5);
		
		gb2.addScore(20.00);
		gb2.addScore(40.00);
		gb2.addScore(50.00);
		gb2.addScore(60.00);
		gb2.addScore(80.00);
		
	}
	

	@After
	public void tearDown() throws Exception {
		gb1 = null;
		gb2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(gb1.toString().equals("1.1 2.2 3.3 4.4 5.5 "));
		assertTrue(gb2.toString().equals("20.0 40.0 50.0 60.0 80.0 "));
	
		assertEquals(gb1.getScoreSize(),5);
		assertEquals(gb2.getScoreSize(),5);
	}

	@Test
	public void testSum() {
		double sum1 = 1.1 + 2.2 + 3.3 + 4.4 + 5.5;
		double sum2 = 20.00 + 40.00 + 50.00 + 60.00 + 80.00;
		
		assertTrue(gb1.sum() == sum1);
		assertTrue(gb2.sum() == sum2);
	}

	@Test
	public void testMinimum() {
		assertTrue(gb1.minimum() == 1.1);
		assertTrue(gb2.minimum() == 20.00);
	}

	@Test
	public void testFinalScore() {
		assertTrue(gb1.finalScore() == 2.2 + 3.3 + 4.4 + 5.5);
		assertTrue(gb2.finalScore() == 40.00 + 50.00 + 60.00 + 80.00);
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(gb1.getScoreSize(),5);
		assertEquals(gb2.getScoreSize(),5);
	}

	@Test
	public void testToString() {
		assertTrue(gb1.toString().equals("1.1 2.2 3.3 4.4 5.5 "));
		assertTrue(gb2.toString().equals("20.0 40.0 50.0 60.0 80.0 "));
	}

}
