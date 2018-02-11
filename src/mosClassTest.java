import static org.junit.Assert.*;

import org.junit.Test;

public class mosClassTest {

	@Test
	public void test() {
		Controller n=new Controller();
		Model m=new Model();
		n.add(m);
		n.sqrtActionPerformed(null,"100");
		assertEquals((int)m.getResult(),10);
	}

}
