package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		//declare elements
		@FindBy(name="username")
		private WebElement unTB;
		
		@FindBy(name="pwd")
		private WebElement pwdTB;
		
		@FindBy(id="LoginButton")
		private WebElement loginBtn;
		
		//initialize elements
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		//utilizations
		public void setUsername(String un){
			unTB.sendKeys(un);
		}
		public void setPassword(String pwd){
			pwdTB.sendKeys(pwd);
		}
		public void clickLogin(){
			loginBtn.click();
		}
		public void clearFields()
		{
			unTB.clear();
			pwdTB.clear();
		}

}
