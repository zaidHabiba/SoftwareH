import static org.junit.Assert.*;

import org.junit.Test;

public class sqrtclassTest {

	@Test
	public void test() {
		View v=new View();
		Controller n=new Controller();
		Model m=new Model();
		n.add(m);
		n.add(v);
		v.add(n);
		
		assertTrue(!n.sqrtActionPerformed(null, "-1"));
	}

}
