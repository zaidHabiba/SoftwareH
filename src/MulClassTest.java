import static org.junit.Assert.*;

import org.junit.Test;

public class MulClassTest {

	@Test
	public void test() {
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.mulActionPerformed(null,"5", "50");
		assertEquals((int)m.getResult(),250);
	}

}
