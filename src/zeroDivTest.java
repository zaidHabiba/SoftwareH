import static org.junit.Assert.*;

import org.junit.Test;

public class zeroDivTest {

	@Test
	public void test() {
		View v=new View();
		Controller c=new Controller();
		Model m=new Model();
		c.add(m);
		c.add(v);
		v.add(c);
		
		assertTrue(!c.divActionPerformed(null, "10", "0"));

	}

}
