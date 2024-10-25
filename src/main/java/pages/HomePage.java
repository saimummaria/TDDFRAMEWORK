package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import constants.Attribute;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

// new, you have to manually write it to get access of common actions
// this is possible when they are static in nature, * means all
// This is called static import
import static common.CommonActions.*;
import static common.CommonWaits.*;
import java.io.File;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor)driver;
	}
	
	@FindBy(xpath = "//img[@alt='Enthrall IT']")
	WebElement logo;
	
	@FindBy(id= "login-link")
	WebElement loginFromToolbar;
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement userId;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(css = "input.btn.btn-lg.px-5")
	WebElement loginButton;
	
	@FindBy(id="dashboard-link")
	WebElement headerofDashbord;
	
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;
	
	@FindBy(partialLinkText = "Enroll Now")
	WebElement enrollNow;

	@FindBy(xpath = "//input[@id='id_f_name']")
	WebElement fName;
	
@FindBy(xpath="//input[@id='id_m_name']")	
WebElement middleName;
	
@FindBy(xpath = "//input[@id='id_l_name']")
WebElement lName;

@FindBy(xpath = "//select[@id='id_i_am']")
	WebElement iAm;
@FindBy(xpath = "//select[@id='id_i_am']/option")
List<WebElement>iAmList;

@FindBy(xpath="//select[@id='id_course_wish_to_enroll']")
WebElement course;

@FindBy(xpath="//select[@id='id_course_wish_to_enroll']/option")
List<WebElement>courseList;

@FindBy(xpath="//input[@id='id_phone']")
WebElement phoneNumber;
@FindBy(xpath="//input[@id='id_email']")
WebElement email;
@FindBy(xpath="//input[@id='id_password']")
WebElement pass;
@FindBy(xpath="//i[@id='fpassword-icon']")
WebElement ibutton;
@FindBy(xpath="//select[@id='id_gender']")
WebElement gender;
@FindBy(xpath="//select[@id='id_gender']/option")
List<WebElement>genderList;
@FindBy(xpath="//input[@id='id_image']")
WebElement personalImage;
@FindBy(xpath="//input[@id='id_photo_id']")
WebElement photoId;
@FindBy(xpath="//select[@id='id_birth_year']")
WebElement birthyear;

@FindBy(xpath = "//select[@id='id_birth_month']")
WebElement birthMonth;
@FindBy(xpath="//select[@id='id_birth_date']")
WebElement birthDate;
@FindBy(xpath="//input[@id='id_home_address_line_1']")
WebElement homeAddress1;
@FindBy(xpath = "//input[@name='home_address_line_2']")
WebElement homeAddres2;
// input[@name='city']
@FindBy(xpath = "//input[@name='city']")
WebElement city;
@FindBy(xpath = "//select[@name='state']")
WebElement state;
// input[@name='zip_code']
@FindBy(xpath = "//input[@name='zip_code']")
WebElement zipCode;
@FindBy(xpath = "//select[@id='id_immigration_status']")
WebElement immigrationStatus;
@FindBy(xpath = "//input[@id='id_know_us']")
WebElement HowDidYouKnow;
@FindBy(xpath = "//input[@id='id_arrival_date']")
WebElement dateOfArrival;
@FindBy(xpath = "//input[@name='emergency_contact']")
WebElement imergencyContact;
@FindBy(xpath = "//select[@id='id_highest_education']")
WebElement education;

@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']")
WebElement country;

@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']/option")
List<WebElement> setOfCountry;

@FindBy(xpath = "//input[@id='is_agree']")
WebElement checkBoxIagree;

@FindBy(xpath = "//input[@name='sign_by_name']")
WebElement signature;

@FindBy(css = "select#id_primary_language")
WebElement language;
@FindBy(xpath = "//select[@id='id_primary_language']/option")
List<WebElement> listOfLanguage;
@FindBy(xpath = "//button[@id='submit_button']")
WebElement submit;

@FindBy(xpath = "//small[text()='First Name is a required field.']")
WebElement FirstNameErrorMassage;
@FindBy(xpath = "//small[@id='f_name_error']")
WebElement FirstNameMustAlphabeticCharecterErrorMassage;
// small[@id='f_name_error']
@FindBy(xpath = "//small[text()='Last Name is a required field.']")
WebElement lastNameOfErrorMassageLastNameIsARequiredField;
@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
WebElement lNameErrorMustBeAlphabeticCharacters;
@FindBy(xpath = "//small[@id='i_am_error']")
WebElement iAmOfErrorMassage;

@FindBy(xpath = "//small[text()='Course Wish to Enroll is a required field.']")

WebElement courseOfErrorMassage;

@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
WebElement phoneNumberIsARequiredField;

@FindBy(xpath = "//small[text()='Email Address is a required field.']")
WebElement emailAddressOfErrorMassage;

@FindBy(xpath = "//span[text()='Password is a required field.']")
WebElement passwordOfErrorMassage;

@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
WebElement photoIdOfErrorMassage;
@FindBy(xpath = "//span[text()='Must contain a minimum of 8 characters.']")
WebElement passWordMustContainAMinimumOf8Characters;
@FindBy(xpath = "//span[text()='Personal Image is a required field.']")
WebElement personalImageOfErrorMassage;

@FindBy(xpath = "//span[text()='Birth Year is a required field.']")
WebElement birthYearOfErrorMassage;

@FindBy(xpath = "//span[text()='Birth Month is a required field.']")
WebElement birthMonthOfErrorMassage;

@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
WebElement birthDateOfErrorMassage;

@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
WebElement homeAdressOfErrorMassage;

@FindBy(xpath = "//span[text()='City is a required field.']")
WebElement cityOfErrorMassage;

@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
WebElement howDidYouKnowOfErrorMassage;

@FindBy(xpath = "//span[@id='stateerror']")
WebElement stateOfErrorMassage;

@FindBy(xpath = "//span[@id='zip_code_error']")
WebElement zipCodeOfErrorMassage;

@FindBy(xpath = "//span[text()='Signature is a required field.']")
WebElement signatureOfErrorMassage;

@FindBy(xpath = "//a[text()='Back']")
WebElement backButton;

@FindBy(xpath = "//a[text()='Cancel']")
WebElement cancelButton;
@FindBy(xpath = "//button[text()='Submit']")
WebElement submitButton;

@FindBy(xpath = "//select[@id='id_highest_education']/option")
List<WebElement> setOfEducation;
	public void clickLogo() {
		logo.click();
		pause(4000);
	}
	
	
	// We used throws to handle exception in this method
		public void enrollNow() {
			elementDisplayed(loginFromToolbar);
			//clickElement(loginFromToolbar);
			js.executeScript("arguments[0].click()", loginFromToolbar);
			pause(4000);
			elementDisplayed(userId);
			inputText(userId, "7572maria@gmail.com");
			elementDisplayed(password);
			inputText(password, "@#STM2024@#");
			elementEnabled(loginButton);
			//verifyTextOfTheWebElement(loginButton, "Log In");
			clickElement(loginButton);
			pause(4000);
			//elementDisplayed(automation);
			//clickElement(automation);	
			automation.click();
			pause(4000);
			elementEnabled(enrollNow);
			verifyTextOfTheWebElement(enrollNow, "Enroll Now");
			clickElement(enrollNow);
			pause(4000);
			Set<String> allWindowHandles =  driver.getWindowHandles();
			// Extract Parent and child window from all window handles
			String parent = (String)allWindowHandles.toArray()[0];
			String child = (String)allWindowHandles.toArray()[1];
			driver.switchTo().window(child);
			pause(4000);
		}public void firstNameValidation() {
			pause(3000);
			driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
			verifyLengthOfTheFieldContent(fName, Attribute.MAX_LENGTH,"20");
			pause(3000);
			inputTextThenClickTab(fName, "#%&*()^%");
			pause(3000);
			verifyErrorMessageUnderTheField(FirstNameMustAlphabeticCharecterErrorMassage, Attribute.INNER_HTML,
					"Must be alphabetic characters.");
			pause(3000);
			clearTextFromTheField(fName);
			inputTextThenClickTab(fName, "");
			verifyErrorMessageUnderTheField(FirstNameErrorMassage, Attribute.INNER_HTML ,
					"First Name is a required field");
			pause(3000);
			inputTextThenClickTab(fName, "987654321");
			pause(3000);
			clearTextFromTheField(fName);
			verifyErrorMessageUnderTheField(FirstNameMustAlphabeticCharecterErrorMassage, Attribute.INNER_HTML,
					"Must be alphabetic characters");
			pause(3000);
			inputTextThenClickEnter(fName, "Maria");
		}
	 
		public void FillupAplicationPageAndClickSubmitButton() {
			pause(3000);
			//driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			pause(3000);
			inputText(fName, "Saimum");
			pause(3000);
			inputText(middleName, "Akter");
			pause(3000);
			inputText(lName, "Maria");
			pause(3000);
			selectDropdown(iAm, "a Student");
			pause(3000);
			selectDropdown(course, "Python");
			pause(3000);
			inputText(phoneNumber, "2406657037");
			pause(3000);
			inputText(email, "7572maria@gmail.com");
			pause(3000);
			inputText(pass, "388556Bd@");
			pause(3000);
			selectDropdown(gender, "Female");
			pause(3000);
			uploadPhotoImage(personalImage, "C:\\Users\\7572m\\OneDrive\\Pictures\\Camera Roll 1");
			pause(3000);
			uploadPhotoImage(photoId, "C:\\Users\\7572m\\OneDrive\\Pictures\\Camera Roll 1");
			pause(3000);
			selectDropdown(birthyear, "2000");
			pause(3000);
			selectDropdown(birthMonth, "October");
			pause(3000);
			selectDropdown(birthDate, "1");
			pause(3000);
			inputText(homeAddress1, "2217 falls st");
			inputTextThenClickEnter(homeAddres2, "637 20th st");
			pause(3000);
			inputText(city, "Niagara Falls");
			inputText(state, "New York");
			inputText(zipCode, "14303");
			selectDropdown(immigrationStatus, "Permanent Resident");
			inputText(dateOfArrival, "05/07/2023");
			pause(3000);
			inputText(imergencyContact, "240******");
			pause(4000);
			inputText(HowDidYouKnow, "From Social media");
			selectDropdown(education, "High School");
			pause(3000);
			
			selectDropdown(country, "Bangladesh");
			pause(3000);
			selectDropdown(language, "English");
			pause(3000);
			inputText(signature, "Maria");
			
			clickElement(checkBoxIagree);
			pause(3000);
			clickElement(submit);
		}
		public void personalImageAndphotoIdValidation() {
			driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
			pause(4000);
			File file =new File("C:\\Users\\7572m\\OneDrive\\Pictures\\Camera Roll 1");
			personalImage.sendKeys(file.getAbsolutePath());
			pause(4000);
			File file01=new File("C:\\Users\\7572m\\OneDrive\\Pictures\\Camera Roll 1");
			photoId.sendKeys(file01.getAbsolutePath());
			pause(3000);
		}
		public void sendKeysPassWord() {
			pause(3000);
			loginFromToolbar.click();
			pause(3000);
			userId.sendKeys("7572maria@gmail.com");
			pause(4000);
			password.sendKeys("@#STM2024@#");
			pause(3000);
			loginButton.click();
		}
		public void clickLogInButton() {
			pause(3000);
			clickElement(loginFromToolbar);
			pause(3000);
			elementDisplayed(headerofDashbord);
			validationOfHeader(headerofDashbord, "Login into your account");
			pause(3000);
			elementEnabled(email);
			inputText(email, "7572maria@gmail.com");
			pause(3000);
			elementEnabled(password);
			inputTextThenClickEnter(password, "@#STM2024@#");
			clickElement(loginButton);
			
		}
		
		public void loginButtonFromTolber() {
			driver.findElement(By.cssSelector("input.btn.btn-lg.px-5")).click();
		}
		public void clickAutomation() {

			pause(6000);
			validationOfHeader(headerofDashbord, "Dashboard");
			automation.click();
			validationOfHeader(automation, "Automation");
		}
		
		
		
	public void clickLName() {
		pause(4000);
		elementDisplayed(loginFromToolbar);
		clickElement(loginFromToolbar);
		pause(4000);
		elementDisplayed(userId);
		inputText(userId, "7572maria@gmail.com");
		pause(2000);
		inputText(password, "@#STM2024@#");
	pause(2000);
		elementEnabled(loginButton);
		clickElement(loginButton);
		pause(4000);
		elementDisplayed(automation);
		clickElement(automation);
	pause(3000);
		elementEnabled(enrollNow);
		clickElement(enrollNow);
		Set<String> allWindowHandles=driver.getWindowHandles();
		String parent= (String)allWindowHandles.toArray()[0];
		String child= (String)allWindowHandles.toArray()[1];
		driver.switchTo().window(child);
		pause(4000);		fName.sendKeys("Maria");
		pause(4000);
	middleName.sendKeys("Akter");
		pause(3000);
		lName.sendKeys("Saimum");
		Select select =new Select(iAm);
		select.selectByVisibleText("Unemployed");
			pause(4000);
			
	WebElement co=	driver.findElement(By.xpath("//select[@id='id_course_wish_to_enroll']"));
List<WebElement> cos = driver.findElements(By.xpath("//select[@id='id_course_wish_to_enroll']/option"));
		Select  select1=new Select(co);
		for (int i=1;i<cos.size();i++) {
			System.out.println(cos.get(i));
			}
		Select select2=new Select(birthMonth)	;
		select2.selectByVisibleText("January");
		pause(4000);
		
		selectElelementFromDropdownOnebyOne(education, setOfEducation);
		selectDropdown(education, "Graduate");
		pause(4000);
	}
	public void lastNameValidation() {
		pause(4000);
		driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		//verifyLengthOfTheFieldContent(lName, Attribute.MAX_LENGTH, "20");
		pause(3000);
		inputTextThenClickTab(lName, "$$^&@$(");
		pause(3000);
		verifyErrorMessageUnderTheField(lNameErrorMustBeAlphabeticCharacters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(lName);
		inputTextThenClickEnter(lName, " ");
		verifyErrorMessageUnderTheField(lastNameOfErrorMassageLastNameIsARequiredField, Attribute.INNER_HTML,
				"Last Name is a required field.");
		pause(3000);
		inputTextThenClickTab(lName, "23456667");
		pause(3000);
		verifyErrorMessageUnderTheField(lNameErrorMustBeAlphabeticCharacters, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		inputTextThenClickEnter(lName, "Saimum");

	}
		
	
	
	
	
	

		
	}
	



