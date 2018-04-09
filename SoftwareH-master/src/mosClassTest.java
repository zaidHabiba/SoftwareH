import static org.junit.Assert.*;
import org.junit.Test;

public class mosClassTest {

	@Test
	public  void test() {
		Controller c=new Controller();
		Model m=new Model();
		c.addModel(m);
		c.sqrtActionPerformed(null,"100");
		assertEquals((int)m.getResult(),10);
	}

}
