package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
	@FindBy(name="login")
	private WebElement usernameTxtBox;
	@FindBy(name="password")
	private WebElement passwordTxtBox;
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginBtn;
	public SignInPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernameTxtBox(){
		return usernameTxtBox;
	}
	public WebElement getPasswordTxtBox(){
		return passwordTxtBox;
	}
	public WebElement getLoginBtn(){
		return loginBtn;
	}
}
