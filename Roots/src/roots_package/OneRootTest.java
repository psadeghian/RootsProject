package roots_package;
import static org.junit.Assert.*;
import org.junit.Test;
	/** @author psadeghian and annasandifer
	*/

// Case where the equation has exactly one root (b^2 = 4ac)
public class OneRootTest {
	double valueA = 16;
	double valueB = 8;
	double valueC = 1;
	
	@Test
	public void testNumRoots() {
		Roots roots = new Roots(valueA,valueB,valueC);
		int numRoots = roots.num_roots();
		assertEquals(numRoots,1,0);
	}
	@Test
	public void testFirstRoot() {
		Roots roots = new Roots(valueA,valueB,valueC);
		double firstRoot = roots.first_root();
		assertEquals(firstRoot,(double)-0.25,0);
	}
	@Test
	public void testSecondRoot() {
		Roots roots = new Roots(valueA,valueB,valueC);
		double secondRoot = roots.second_root();
		assertEquals(secondRoot,(double)-0.25,0);
	}

}
