package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author iaw47941842
 *
 */

public class SquareTest {
	
	Square square;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		square = new Square(10);
	}

	@After
	public void tearDown() throws Exception {
		square = null;
	}

	@Test
	public final void testPerimeter() {
		assertEquals(40.0, square.perimeter(), 1.0e-4);
		
	}

	@Test
	public final void testArea() {
		assertEquals(100.0, square.area(), 1.0e-4);
		
	}

}
