package br.com.shoestock.functions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.shoestock.elements.ElementsShoestock;

public class TestShoestock {
	private ElementsShoestock pageStock;
	public TestShoestock(WebDriver driver) {
		pageStock = new ElementsShoestock(driver);
	}

	public void setUrl(String pUrl) {
		pageStock.driver.navigate().to(pUrl);
	}
	
	public void setSearch(String searchText) {
		pageStock.getSearchTextbox().sendKeys(searchText);
	}

	public void setFieldRegistration(String pRegistration) {
		//page.registrationField.sendKeys(pRegistration);
	}

	public void submitFieldContinue() {
		//page.submitFieldContinue.click();

	}

	public void clickSearchBtn() {
		pageStock.getSearchButton().click();
		
	}

	public void checkListSandalias() {
		List<WebElement> elements = pageStock.getListSandalias();
		Assert.assertTrue(elements.size() > 0);
	}

	public void includeItem(int num) {
		List<WebElement> elements = pageStock.getListSandalias();
		elements.get(num).click();
	}

	public void addToCard(int size) {
		pageStock.getSizeButton(String.valueOf(size)).click();
		pageStock.getBuyButton().click();
	}

	public void verifyCart() {
		Assert.assertNotNull(pageStock.getCartPage());
	}
	
}