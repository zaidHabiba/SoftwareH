import static org.junit.Assert.*;

import org.junit.Test;

public class SubClassTest {

	@Test
	public void test() {
		Controller n=new Controller();
		Model m=new Model();
		n.add(m);
		n.subActionPerformed(null,"5", "55");
		assertEquals((int)m.getResult(),-50);
	}

}
