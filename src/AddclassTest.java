//package org.junit 


import static org.junit.Assert.*;
import org.junit.Test;


public class AddclassTest {

	
	
	
	
	@Test
	public  void test() {
		
		Controller c=new Controller();
		Model m=new Model();
		c.addModel(m);
	    View v=new View();
		c.addView(v);
		v.addController(c);
		c.addActionPerformed(null,"5", "55");
		assertEquals(m.getResult(),60,0);
	
		}

}
