import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		View v=new View();
		Controller n
		=new Controller();
		Model m=new Model();
		n.add(m);
		n.add(v);
		v.add(n);
		
		boolean stringEnter=false;
		if(!n.addActionPerformed(null, "566", "ddd")&&!n.subActionPerformed(null, "566", "ddd")
				&&!n.mulActionPerformed(null, "566", "yy")&&!n.divActionPerformed(null, "566", "ddd")
				&&!n.modActionPerformed(null, "566", "ddd")&&!n.sqrtActionPerformed(null, "ddd")){
			stringEnter=true;
		}
		assertTrue(stringEnter);
	}

}
