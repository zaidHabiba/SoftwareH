import static org.junit.Assert.*;

import org.junit.Test;

public class SubClassTest {

	@Test
	public   void test() {
		Controller c=new Controller();
		Model m=new Model();
		c.addModel(m);
		c.subActionPerformed(null,"50", "5");
		assertEquals((int)m.getResult(),45);
	}

}
