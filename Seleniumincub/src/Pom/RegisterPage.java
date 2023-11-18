package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	@FindBy(id="gender-female")
	WebElement genderButton;
	
	@FindBy(id="FirstName")
	WebElement firstTB;
	
	@FindBy(id="LastName")
	WebElement lastTB;
	
	@FindBy(id="Email")
	WebElement emailTB;
	
	@FindBy(id="Password")
	WebElement passwordTB;
	
	@FindBy(id="ConfirmPassword")
	WebElement conformTB;
	
	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getGenderButton() {
		return genderButton;
	}


	public WebElement getFirstTB() {
		return firstTB;
	}


	public WebElement getLastTB() {
		return lastTB;
	}


	public WebElement getEmailTB() {
		return emailTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public WebElement getConformTB() {
		return conformTB;
	}


	public WebElement getRegisterButton() {
		return registerButton;
	}
	@FindBy(id="register-button")
	WebElement registerButton;
	
	

}
