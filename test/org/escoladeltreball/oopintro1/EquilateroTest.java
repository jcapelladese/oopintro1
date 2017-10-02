/**
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw47941842
 *
 */
public class EquilateroTest {
	
	Equilatero equilatero;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		equilatero = new Equilatero(5, 10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		equilatero = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Equilatero#perimeter()}.
	 */
	@Test
	public final void testPerimeter() {
		assertEquals(15, equilatero.perimeter(), 1.0e-4);
	}

}
