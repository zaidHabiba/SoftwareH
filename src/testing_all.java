import static org.junit.Assert.*;

import org.junit.Test;

public class testing_all {

	@Test
	
	public void testAdd() {
		
		new AddclassTest().test();
		
	}
	
	@Test
	
    public void testdiv() {
		new divclassTest().test();
	}
	
	@Test

    public void testmod() {
    	new mosClassTest().test();
	
    }
	
	@Test

    public void testMul() {
    	new MulClassTest().test();
	
    }
	
	@Test

    public void testsqrt() {
	
    	new sqrtclassTest().test();
    }
	
	@Test
    
    public void testString() {
    	
    	new StringTest().test();
	
    }
	
	@Test
    
    public void testSub() {
	
    	new SubClassTest().test();
    }
	
	@Test
    
    public void testzeroDiv() {
    	
    	new zeroDivTest().test();
	
    }
	
	
	
	
	

}
