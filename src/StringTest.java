import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		View v=new View();
		Controller con=new Controller();
		Model m=new Model();
		con.add(m);
		con.add(v);
		v.add(con);
		
		boolean stringEnter=false;
		if(!con.addActionPerformed(null, "566", "ddd")&&!con.subActionPerformed(null, "566", "ddd")
				&&!con.mulActionPerformed(null, "566", "yy")&&!con.divActionPerformed(null, "566", "ddd")
				&&!con.modActionPerformed(null, "566", "ddd")&&!con.sqrtActionPerformed(null, "ddd")){
			stringEnter=true;
		}
		assertTrue(stringEnter);
	}

}
