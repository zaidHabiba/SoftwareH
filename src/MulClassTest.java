import static org.junit.Assert.*;

import org.junit.Test;

public class MulClassTest {

	@Test
	public void test() {
		Controller c=new Controller();
		Model m=new Model();
		c.add(m);
		c.mulActionPerformed(null,"5", "50");
		assertEquals((int)m.getResult(),250);
	}

}
