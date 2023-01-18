import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import br.com.shoestock.elements.ElementsAutomationPractice;

public class TestSelenium {
	private EdgeDriver driver;
	private ElementsAutomationPractice pageAutomation;


	@Before
	public void beforeTest() {
		File edgedriver = new File("src/test/resources/drivers/msedgedriver.exe");
		System.setProperty("webdriver.edge.driver", edgedriver.getAbsolutePath());
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		pageAutomation = new ElementsAutomationPractice(driver);
	}
	
	
	@Test
	public void testeWeb() {
		driver.get("https://automationexercise.com/");
	
		pageAutomation.getLoginButton().click();
		pageAutomation.getEmailInput().sendKeys("labusuario@test.com");
		pageAutomation.getNameInput().sendKeys("LabUsuario");
		pageAutomation.getSignUpButton().click();
		
		String text = pageAutomation.getErrorLoginText().getText();
		assertEquals("ENTER ACCOUNT INFORMATION", text);
	}
	
	
	@Test
	public void testeWebProdutos() {
		driver.get("https://automationexercise.com/");
	
		driver.findElement(By.cssSelector("a[href='/products']")).click();
		driver.findElement(By.cssSelector("a[href='#Women']")).click();
		driver.findElement(By.xpath("//a[text()='Tops ']")).click();
		String titleText = driver.findElement(By.cssSelector("h2[class='title text-center']")).getText();
		
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		
		assertEquals("Women - Tops Products", titleText);
	}
	
	
	@After
	public void afterTest() {
		//driver.close();
	}
	
	
}
