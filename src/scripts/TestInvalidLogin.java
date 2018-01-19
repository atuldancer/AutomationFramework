package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pomPages.LoginPage;

public class TestInvalidLogin extends BaseTest{
	
	@Test
	public void testInvalidLogin()
	{
		LoginPage l = new LoginPage(driver);
		int rowCount = Lib.getRowCount(EXCEL_PATH, "InvalidLogin");
		for(int i=1; i < rowCount; i++)
		{
		String username = Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 0);
		String password = Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 1);
		l.setUsername(username);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		l.setPassword(password);
		//click on login button
		l.clickLogin();
		l.clearFields();
		}
	}
}
