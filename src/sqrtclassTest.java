import static org.junit.Assert.*;

import org.junit.Test;

public class sqrtclassTest {

	@Test
	public void test() {
		View v=new View();
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.add(v);
		v.add(con);
		
		assertTrue(!con.sqrtActionPerformed(null, "-1"));
	}

}