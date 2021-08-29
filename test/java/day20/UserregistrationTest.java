package day20;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserregistrationTest {

	@Test
	public void test() 
	{
		UserRegistration user=new UserRegistration();
		String result=user.FirstName("Bindu");
		assertEquals(result,"Bindu");
	}

}
