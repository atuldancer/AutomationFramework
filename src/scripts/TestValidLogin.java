package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pomPages.LoginPage;

public class TestValidLogin extends BaseTest {
		
	@Test
	public void testValidlogin()
	{
		LoginPage l = new LoginPage(driver);
		
		//Enter username
		String username = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		l.setUsername(username);
		
		//enter password
		String password = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		l.setPassword(password);
		
		//click on login button
		l.clickLogin();
	}
}
