


import static org.junit.Assert.*;

import org.junit.Test;


public class AddclassTest {

	

	@Test
	public void test() {
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.addActionPerformed(null,"5", "55");
		assertEquals((int)m.getResult(),60);
	}

}
