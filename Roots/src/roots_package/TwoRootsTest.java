package roots_package;
import static org.junit.Assert.*;
import org.junit.Test;
	/** @author psadeghian and annasandifer
	*/

// Case where q > 0 && a!=0
public class TwoRootsTest {
	double valueA = 1;
	double valueB = -6;
	double valueC = 8;
	
	@Test
	public void testNumRoots() {
		Roots roots = new Roots(valueA,valueB,valueC);
		int numRoots = roots.num_roots();
		assertEquals(numRoots,2,0);
	}
	@Test
	public void testFirstRoot() {
		Roots roots = new Roots(valueA,valueB,valueC);
		double firstRoot = roots.first_root();
		assertEquals(firstRoot,(double)4,0);
	}
	@Test
	public void testSecondRoot() {
		Roots roots = new Roots(valueA,valueB,valueC);
		double secondRoot = roots.second_root();
		assertEquals(secondRoot,(double)2,0);
	}

}
