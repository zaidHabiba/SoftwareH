


import static org.junit.Assert.*;

import org.junit.Test;


public class AddclassTest {

	

	@Test
	public void test() {
		Controller c=new Controller();
		Model m=new Model();
		c.add(m);
		c.addActionPerformed(null,"5", "55");
		assertEquals((int)m.getResult(),60);
	}

}
