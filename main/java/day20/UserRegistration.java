package day20;

public class UserRegistration 
{
	public boolean FirstName(String fname)
	{
		boolean name;
		name=Character.isUpperCase(fname.charAt(0));
		if(name && fname.length()>=3)
			return true;
		else
			return false;
	}
	
}
