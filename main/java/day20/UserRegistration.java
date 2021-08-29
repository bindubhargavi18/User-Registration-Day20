package day20;

import java.util.regex.Pattern;

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
	public boolean secondName(String sname)
	{
		boolean name;
		name=Character.isUpperCase(sname.charAt(0));
		if(name && sname.length()>=3)
			return true;
		else
			return false;
	}
	public boolean email(String mail)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	 
		Pattern pattern = Pattern.compile(regex);
		if(pattern.matcher(mail).matches()) 
			return true;
		else
			return false;
	}
	
}
