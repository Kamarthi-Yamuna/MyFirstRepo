package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	public LoginPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(id="Email")
	private WebElement emailTB;
	
	@FindBy(id="Password")
	private WebElement passwordTB;
	
	@FindBy(id="RememberMe")
	private WebElement remeber;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRemeber() {
		return remeber;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
