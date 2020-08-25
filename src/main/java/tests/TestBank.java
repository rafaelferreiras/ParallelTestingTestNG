package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import managers.BaseTestFactory;
import page_objects.LogInBankPage;
import page_objects.SavingAddPage;

public class TestBank extends BaseTestFactory {

	LogInBankPage logInBankPage;
	SavingAddPage savingAdd;

	@BeforeMethod
	public void login() {

		logInBankPage = new LogInBankPage();
		logInBankPage.preencherLogin("testing@qa.com").preencheSenha("Test123456").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver1() {

		System.out.println(getDriver().hashCode());
		System.out.println("Over1-" + Thread.currentThread().getId());
		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver2() {

		System.out.println(getDriver().hashCode());
		System.out.println("Over2-" + Thread.currentThread().getId());
		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

}
