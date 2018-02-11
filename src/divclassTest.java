import static org.junit.Assert.*;

import org.junit.Test;

public class divclassTest {

	@Test
	public  void test() {
		Controller c=new Controller();
		Model m=new Model();
		c.addModel(m);
		c.divActionPerformed(null,"550", "10");
		assertEquals((int)m.getResult(),55);
	}

}
