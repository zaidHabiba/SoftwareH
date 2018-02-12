import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {

	//@Test
	public  void test() {
		View v=new View();
		Controller c=new Controller();
		Model m=new Model();
		c.addModel(m);
		c.addView(v);
		v.addController(c);
		
		boolean stringEnter=false;
		if(!c.addActionPerformed(null, "566", "ddd")&&!c.subActionPerformed(null, "566", "ddd")
				&&!c.mulActionPerformed(null, "566", "yy")&&!c.divActionPerformed(null, "566", "ddd")
				&&!c.modActionPerformed(null, "566", "ddd")&&!c.sqrtActionPerformed(null, "ddd")){
			stringEnter=true;
		}
		assertTrue(stringEnter);
	}

}
