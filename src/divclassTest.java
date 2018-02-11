import static org.junit.Assert.*;

import org.junit.Test;

public class divclassTest {

	@Test
	public void test() {
		Controller n=new Controller();
		Model m=new Model();
		n.add(m);
		n.divActionPerformed(null,"550", "10");
		assertEquals((int)m.getResult(),55);
	}

}
