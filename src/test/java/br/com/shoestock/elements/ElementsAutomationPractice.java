package br.com.shoestock.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import br.com.shoestock.utils.BaseWebPageFactory;

public class ElementsAutomationPractice extends BaseWebPageFactory{
	public WebDriver driver;
	// Locators

	@FindBy(how = How.CSS, using = "a[href='/login']")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//form[@action='/signup']/input[@name='email']")
	private WebElement emailInput;

	@FindBy(how = How.XPATH, using = "//form[@action='/signup']/input[@name='name']")
	private WebElement nameInput;

	@FindBy(how = How.XPATH, using = "//form[@action='/signup']/button")
	private WebElement signUpButton;

	@FindBy(how = How.XPATH, using = "//form[@action='/signup']/parent::div/h2/b")
	private WebElement errorLoginText;
	
	
	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getNameInput() {
		return nameInput;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getErrorLoginText() {
		return errorLoginText;
	}
	
	public ElementsAutomationPractice(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

}
