package tconp;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class fac{
    @Test
    
	@Factory
	public Object[] invokeobject() {
		Object[] data = new Object[3];
		data[0]=new Factorry(1);
		data[1]=new Factorry(2);
	data[2]=new Factorry(3);
	return data;
	}	
}