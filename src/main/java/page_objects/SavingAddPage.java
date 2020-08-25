package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.BasePage;

public class SavingAddPage extends BasePage {

	public SavingAddPage() {
		
		PageFactory.initElements(driverBasePage, this);
	}



	@FindBy(how = How.ID, using = "Savings")

	public WebElement radio_Savings;

	@FindBy(how = How.ID, using = "Money Market")

	public WebElement radio_MoneyMarket;

	@FindBy(how = How.ID, using = "Individual")

	public WebElement radio_Individual;

	@FindBy(how = How.ID, using = "Joint")

	public WebElement radio_Joint;

	@FindBy(how = How.ID, using = "name")

	public WebElement text_Accname;

	@FindBy(how = How.ID, using = "openingBalance")

	public WebElement text_InitialDeposit;

	@FindBy(how = How.ID, using = "newSavingsSubmit")

	public WebElement btn_SavingsSubmit;

	@FindBy(how = How.CLASS_NAME, using = "btn btn-danger btn-sm")

	public WebElement btn_Reset;

	@FindBy(how = How.XPATH, using = "//*[@class=\"h4 m-0\"]")

	public WebElement AccNameSuccessfully;

	@FindBy(how = How.CSS, using = ".sufee-alert > span:nth-child(2)")

	public WebElement failCreateAcc;

	@FindBy(how = How.ID, using = "savings-menu")

	public WebElement menu_Savings;

	@FindBy(how = How.ID, using = "new-savings-menu-option")
	public WebElement menu_SavingsAdd;

	// set dados
	public SavingAddPage accountTypeSavings() {
		click(radio_Savings);
		return this;
	}

	public SavingAddPage accountTypeMoneyMarket() {
		click(radio_MoneyMarket);
		return this;
	}

	public SavingAddPage accounOwnershipIndividual() {
		click(radio_Individual);
		return this;
	}

	public SavingAddPage accounOwnershipJoint() {
		click(radio_Joint);
		return this;
	}

	public SavingAddPage accountName(String AccName) {
		sendKeys(text_Accname, AccName);
		return this;
	}

	public SavingAddPage initialDeposit(String initialDeposit) {
		sendKeys(text_InitialDeposit, initialDeposit);
		return this;

	}

	public SavingAddPage clicarSubmit() {
		click(btn_SavingsSubmit);
		return this;
	}

	public SavingAddPage ClickMenuSavings() {

		click(menu_Savings);
		return this;
	}

	public SavingAddPage ClickMenuSavingsAdd() {

		click(menu_SavingsAdd);
		return this;
	}
}
