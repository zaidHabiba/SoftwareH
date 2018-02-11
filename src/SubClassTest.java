import static org.junit.Assert.*;

import org.junit.Test;

public class SubClassTest {

	@Test
	public void test() {
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.subActionPerformed(null,"5", "55");
		assertEquals((int)m.getResult(),-50);
	}

}
