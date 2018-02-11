


import static org.junit.Assert.*;

import org.junit.Test;


public class AddclassTest {

	

	@Test
	public void test() {
		Controller n=new Controller();
		Model m=new Model();
		n.add(m);
		n.addActionPerformed(null,"5", "55");
		assertEquals((int)m.getResult(),60);
	}

}
