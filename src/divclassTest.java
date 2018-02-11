import static org.junit.Assert.*;

import org.junit.Test;

public class divclassTest {

	@Test
	public void test() {
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.divActionPerformed(null,"550", "10");
		assertEquals((int)m.getResult(),55);
	}

}
