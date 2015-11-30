package Team4450.Robot8;

import Team4450.Lib.LCD;
import Team4450.Lib.Util;

public class TestClass
{
	private	String	s1;
	
	void TestClass(String s)
	{
		Util.consoleLog();
		LCD.clearAll();
		s1 = s;
	}
	
	public String getString()
	{
		return s1;
	}
	
	public void setString(String s)
	{
		s1 = s;
	}
}
