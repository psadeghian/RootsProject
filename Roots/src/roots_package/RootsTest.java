package roots_package;
import static org.junit.Assert.*;
import org.junit.Test;

public class RootsTest {

	@Test
	public void test() {
		double a = 1, b = 10, c = 4;
		Roots roots = new Roots(a,b,c);
		assertEquals(roots.num_roots(),2,0);
	}

}
