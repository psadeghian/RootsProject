package roots_package;
import static org.junit.Assert.*;
import org.junit.Test;
	/** @author psadeghian and annasandifer
	*/

// Case where the equation has no roots if b^2 < 4ac
public class NoRootsTest {
	double valueA = 3;
	double valueB = 4;
	double valueC = 2;
	
	@Test
	public void testNumRoots() {
		Roots roots = new Roots(valueA,valueB,valueC);
		int numRoots = roots.num_roots();
		assertEquals(numRoots,0,0);
	}
	@Test
	public void testFirstRoot() {
		Roots roots = new Roots(valueA,valueB,valueC);
		double firstRoot = roots.first_root();
		assertEquals(firstRoot,(double)-1,0);
	}
	@Test
	public void testSecondRoot() {
		Roots roots = new Roots(valueA,valueB,valueC);
		double secondRoot = roots.second_root();
		assertEquals(secondRoot,(double)-1,0);
	}

}
