import static org.junit.Assert.*;

import org.junit.Test;

public class sqrtclassTest {

	@Test
	public void test() {
		View v=new View();
		Controller c=new Controller();
		Model m=new Model();
		c.add(m);
		c.add(v);
		v.add(c);
		
		assertTrue(!c.sqrtActionPerformed(null, "-1"));
	}

}
