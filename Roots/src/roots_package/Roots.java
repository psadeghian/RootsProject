package roots_package;
	/** Find the two roots of ax^2 + bx + c,
	 * that is, the values of x for which the result is 0. 3
	 * @author psadeghian and annasandifer
	 */

public class Roots {
        double root_one, root_two;
        int num_roots;
        
		public Roots(double a, double b, double c) {
             double q;
             double r;
             // Apply the textbook quadratic formula:
          // Roots = -b +- sqrt(b^2 - 4ac) / 2a
          q = b*b - 4*a*c;
          if (q > 0 && a!=0) {
        	  // If b^2 > 4ac, there are two distinct roots
              num_roots = 2;
              r = (double)Math.sqrt(q) ;
              root_one = ((0-b) + r)/(2*a);
              root_two = ((0-b) - r)/(2*a);
          } else if(q==0) { // (BUG HERE)
                      // The equation has exactly one root
                         num_roots = 1;
                         root_one = (0-b)/(2*a);
                         root_two = root_one;
          } else {
                     // The equation has no roots if b^2 < 4ac
                        num_roots = 0;
                        root_one = -1;
                        root_two = -1;
          }
   }
   public int num_roots() { return num_roots; }
   public double first_root() { return root_one; }
   public double second_root() { return root_two; }

/**   public static void main(String[] args){
		Roots roots = new Roots(2.33,3.323,4.2323);
		System.out.println("Pasha is great!");
		System.out.println(roots.toString());
   }
*/
}




