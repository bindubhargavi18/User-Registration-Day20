package day20;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserregistrationTest {

	@Test
	public void checkFirstNameStartsWithCapAndShouldHaveMin3Letters() 
	{
		UserRegistration user=new UserRegistration();
		boolean result=user.FirstName("Bindu");
		assertEquals(result,true);
	}
	@Test
	public void checkSecondNameStartsWithCapAndShouldHaveMin3Letters() 
	{
		UserRegistration user=new UserRegistration();
		boolean result=user.secondName("Bindu");
		assertEquals(result,true);
	}
	@Test
	public void emailShouldContainLetterNumbersAtSymbolAndCom()
	{
		UserRegistration user=new UserRegistration();
		boolean result=user.secondName("abc8@gmail.com");
		assertEquals(result,true);
	}
	@Test
	public void phoneNumberShouldContainCountryCodeWith10Digits()
	{
		UserRegistration user=new UserRegistration();
		boolean result=user.phoneNumber("918764321561");
		assertEquals(result,true);
	}
	@Test
	public void passwordShouldContainMin8CharactersAndAtleastOneCaps()
	{
		UserRegistration user=new UserRegistration();
		boolean result=user.password("heuFsw@ds5");
		assertEquals(result,true);
	}
	

}
