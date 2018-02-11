import static org.junit.Assert.*;

import org.junit.Test;

public class MulClassTest {

	@Test
	public void test() {
		Controller n=new Controller();
		Model m=new Model();
		n.add(m);
		n.mulActionPerformed(null,"5", "50");
		assertEquals((int)m.getResult(),250);
	}

}
