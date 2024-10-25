package pagesTest;


import org.testng.annotations.Test;
import baseUtil.BaseClass;
import pages.HomePage;

public class HomePageTest extends BaseClass {
	
	@Test ()
	public void enrollNowTest() throws InterruptedException {
	//homePage.clickLogo();
		homePage.enrollNow();
		
	}
/*@Test
public void firstNameValidation() {
	homePage.firstNameValidation();
}
	@Test
	public void clickLNameTest() {
  homePage.clickLName();
		
	}
	@Test
	public void fillUpAplicationClickSubmitbuttonTest() {
		homePage.enrollNow();
		homePage.FillupAplicationPageAndClickSubmitButton();
	}
	@Test
	public void personalImageAndphotoIdValidation() {
		homePage.personalImageAndphotoIdValidation();
	}
	@Test
	public void lastNameValidationTest() {
		//homePage.enrollNow();
		homePage.lastNameValidation();
	}
	@Test
	public void SendKeysPasswordTest() {
		homePage.sendKeysPassWord();
	}
	@Test
	public void clicLoginButtonTest() {
		homePage.clickLogInButton();
	}
	@Test
	public void clickAutomation() {
		homePage.clickLogInButton();
		homePage.clickAutomation();
	}*/
}
