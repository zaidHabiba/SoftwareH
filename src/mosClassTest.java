import static org.junit.Assert.*;

import org.junit.Test;

public class mosClassTest {

	@Test
	public void test() {
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.sqrtActionPerformed(null,"100");
		assertEquals((int)m.getResult(),10);
	}

}
