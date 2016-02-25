package roots_package;

/**
 * Created by sandiferav on 2/23/2016.
 */
import static org.junit.Assert.*;
import org.junit.Test;
/** @author psadeghian and annasandifer
 */

// Case where the equation has exactly one root (b^2 = 4ac)
// Where q > 0 and a = 0
public class BranchTest {
    double valueA = 0;
    double valueB = 1;
    double valueC = -1;

    @Test
    public void testNumRoots() {
        Roots roots = new Roots(valueA,valueB,valueC);
        int numRoots = roots.num_roots();
        assertEquals(numRoots,1,1);
    }
    @Test
    public void testFirstRoot() {
        Roots roots = new Roots(valueA,valueB,valueC);
        double firstRoot = roots.first_root();
        assertEquals(firstRoot,(double)-0.25,1);
    }
    @Test
    public void testSecondRoot() {
        Roots roots = new Roots(valueA,valueB,valueC);
        double secondRoot = roots.second_root();
        assertEquals(secondRoot,(double)-0.25,1);
    }

}