package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	protected WebDriver driverBasePage;
	protected WebDriverWait wait;
	private BaseTestFactory baseTest;
	
	
	

	public BasePage() {

		baseTest = new BaseTestFactory();
		this.driverBasePage = baseTest.getDriver();
		wait = new WebDriverWait(driverBasePage, 20);
	}

	// text
	public void sendKeys(WebElement element, String text) {

		isElementClickable(element).sendKeys(text);
	}
	
	public String getText(WebElement element) {
		
		return isElementClickable(element).getText();
	}
	

	// click
	public void click(WebElement element) {

		isElementClickable(element).click();
	}

	// Wait
	public WebDriverWait getDriverWait() {

		return wait;
	}

	// wait ElementClickable
	public WebElement isElementClickable(WebElement element) {

		return getDriverWait().until(ExpectedConditions.elementToBeClickable(element));

	}

	// wait visibilityOf
	public void isElementvisibilityOf(WebElement element) {

		getDriverWait().until(ExpectedConditions.visibilityOf(element));

	}

}
