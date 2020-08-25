package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import managers.BaseTestFactory;
import page_objects.LogInBankPage;
import page_objects.SavingAddPage;

public class TestBank750 extends BaseTestFactory {

	LogInBankPage logInBankPage;
	SavingAddPage savingAdd;

	@BeforeClass
	public void login() {

		logInBankPage = new LogInBankPage();
		logInBankPage.preencherLogin("testing@qa.com.br").preencheSenha("Test123456").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver1() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();

	}

	@Test
	public void accountTypeSavingsOver2() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver3() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver4() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver5() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver6() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver7() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver8() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver9() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver10() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver11() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver12() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver13() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver14() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver15() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver16() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver17() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver18() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver19() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver20() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver21() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver22() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver23() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver24() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver25() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver26() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver27() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver28() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver29() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver30() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver31() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver32() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver33() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver34() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver35() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver36() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver37() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver38() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver39() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver40() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver41() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver42() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver43() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver44() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver45() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver46() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver47() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver48() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver49() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver50() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver51() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver52() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver53() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver54() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver55() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver56() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver57() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver58() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver59() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver60() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver61() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver62() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver63() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver64() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver65() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver66() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver67() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver68() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver69() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver70() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver71() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver72() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver73() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver74() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver75() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver76() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver77() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver78() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver79() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver80() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver81() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver82() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver83() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver84() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver85() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver86() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver87() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver88() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver89() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver90() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver91() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver92() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver93() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver94() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver95() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver96() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver97() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver98() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver99() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver100() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver101() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver102() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver103() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver104() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver105() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver106() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver107() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver108() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver109() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver110() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver111() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver112() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver113() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver114() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver115() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver116() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver117() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver118() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver119() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver120() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver121() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver122() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver123() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver124() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver125() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver126() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver127() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver128() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver129() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver130() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver131() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver132() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver133() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver134() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver135() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver136() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver137() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver138() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver139() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver140() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver141() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver142() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver143() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver144() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver145() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver146() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver147() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver148() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver149() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver150() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver151() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver152() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver153() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver154() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver155() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver156() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver157() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver158() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver159() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver160() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver161() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver162() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver163() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver164() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver165() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver166() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver167() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver168() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver169() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver170() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver171() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver172() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver173() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver174() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver175() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver176() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver177() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver178() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver179() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver180() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver181() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver182() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver183() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver184() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver185() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver186() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver187() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver188() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver189() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver190() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver191() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver192() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver193() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver194() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver195() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver196() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver197() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver198() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver199() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver200() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver201() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver202() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver203() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver204() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver205() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver206() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver207() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver208() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver209() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver210() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver211() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver212() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver213() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver214() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver215() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver216() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver217() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver218() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver219() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver220() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver221() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver222() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver223() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver224() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver225() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver226() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver227() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver228() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver229() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver230() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver231() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver232() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver233() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver234() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver235() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver236() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver237() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver238() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver239() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver240() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver241() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver242() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver243() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver244() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver245() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver246() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver247() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver248() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver249() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeSavingsOver250() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver1() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver2() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver3() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver4() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver5() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver6() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver7() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver8() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver9() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver10() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver11() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver12() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver13() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver14() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver15() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver16() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver17() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver18() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver19() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver20() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver21() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver22() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver23() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver24() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver25() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver26() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver27() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver28() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver29() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver30() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver31() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver32() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver33() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver34() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver35() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver36() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver37() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver38() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver39() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver40() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver41() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver42() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver43() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver44() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver45() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver46() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver47() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver48() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver49() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver50() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver51() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver52() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver53() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver54() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver55() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver56() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver57() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver58() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver59() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver60() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver61() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver62() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver63() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver64() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver65() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver66() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver67() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver68() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver69() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver70() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver71() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver72() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver73() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver74() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver75() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver76() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver77() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver78() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver79() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver80() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver81() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver82() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver83() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver84() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver85() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver86() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver87() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver88() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver89() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver90() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver91() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver92() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver93() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver94() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver95() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver96() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver97() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver98() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver99() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver100() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver101() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver102() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver103() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver104() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver105() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver106() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver107() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver108() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver109() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver110() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver111() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver112() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver113() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver114() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver115() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver116() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver117() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver118() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver119() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver120() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver121() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver122() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver123() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver124() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver125() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver126() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver127() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver128() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver129() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver130() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver131() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver132() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver133() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver134() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver135() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver136() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver137() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver138() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver139() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver140() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver141() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver142() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver143() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver144() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver145() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver146() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver147() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver148() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver149() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver150() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver151() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver152() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver153() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver154() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver155() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver156() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver157() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver158() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver159() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver160() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver161() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver162() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver163() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver164() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver165() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver166() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver167() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver168() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver169() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver170() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver171() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver172() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver173() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver174() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver175() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver176() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver177() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver178() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver179() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver180() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver181() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver182() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver183() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver184() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver185() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver186() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver187() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver188() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver189() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver190() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver191() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver192() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver193() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver194() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver195() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver196() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver197() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver198() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver199() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver200() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver201() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver202() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver203() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver204() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver205() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver206() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver207() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver208() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver209() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver210() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver211() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver212() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver213() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver214() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver215() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver216() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver217() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver218() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver219() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver220() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver221() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver222() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver223() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver224() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver225() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver226() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver227() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver228() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver229() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver230() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver231() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver232() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver233() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver234() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver235() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver236() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver237() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver238() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver239() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver240() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver241() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver242() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver243() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver244() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver245() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver246() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver247() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver248() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver249() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketOver250() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("0.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative1() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative2() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative3() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative4() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative5() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative6() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative7() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative8() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative9() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative10() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative11() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative12() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative13() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative14() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative15() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative16() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative17() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative18() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative19() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative20() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative21() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative22() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative23() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative24() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative25() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative26() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative27() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative28() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative29() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative30() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative31() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative32() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative33() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative34() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative35() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative36() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative37() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative38() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative39() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative40() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative41() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative42() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative43() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative44() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative45() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative46() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative47() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative48() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative49() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative50() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative51() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative52() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative53() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative54() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative55() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative56() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative57() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative58() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative59() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative60() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative61() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative62() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative63() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative64() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative65() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative66() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative67() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative68() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative69() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative70() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative71() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative72() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative73() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative74() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative75() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative76() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative77() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative78() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative79() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative80() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative81() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative82() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative83() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative84() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative85() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative86() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative87() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative88() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative89() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative90() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative91() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative92() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative93() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative94() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative95() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative96() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative97() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative98() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative99() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative100() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative101() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative102() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative103() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative104() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative105() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative106() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative107() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative108() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative109() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative110() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative111() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative112() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative113() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative114() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative115() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative116() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative117() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative118() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative119() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative120() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative121() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative122() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative123() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative124() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative125() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative126() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative127() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative128() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative129() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative130() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative131() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative132() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative133() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative134() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative135() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative136() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative137() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative138() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative139() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative140() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative141() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative142() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative143() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative144() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative145() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative146() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative147() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative148() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative149() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative150() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative151() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative152() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative153() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative154() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative155() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative156() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative157() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative158() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative159() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative160() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative161() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative162() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative163() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative164() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative165() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative166() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative167() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative168() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative169() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative170() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative171() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative172() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative173() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative174() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative175() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative176() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative177() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative178() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative179() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative180() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative181() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative182() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative183() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative184() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative185() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative186() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative187() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative188() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative189() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative190() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative191() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative192() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative193() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative194() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative195() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative196() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative197() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative198() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative199() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative200() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative201() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative202() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative203() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative204() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative205() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative206() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative207() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative208() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative209() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative210() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative211() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative212() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative213() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative214() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative215() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative216() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative217() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative218() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative219() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative220() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative221() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative222() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative223() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative224() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative225() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative226() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative227() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative228() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative229() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative230() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative231() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative232() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative233() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative234() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative235() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative236() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative237() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative238() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative239() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative240() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative241() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative242() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative243() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative244() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative245() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative246() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative247() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative248() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative249() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

	@Test
	public void accountTypeMoneyMarketNegative250() {

		savingAdd = new SavingAddPage();
		savingAdd.ClickMenuSavings().ClickMenuSavingsAdd().accountTypeSavings().accounOwnershipIndividual()
				.accountName("NewTest").initialDeposit("-10.00").clicarSubmit();
	}

}
