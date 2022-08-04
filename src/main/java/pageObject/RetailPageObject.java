package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	//scenario 1
	
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement RetailPageText;
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement Myaccount;
	@FindBy(xpath="//div//a[text()='Login']")
	private WebElement Login;
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement UserName;
	@FindBy(id="input-password")
	private WebElement Password;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement logingButton;
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement TextOnAccountDashboard;
	
	//scenario 2
	@FindBy(xpath="//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement RegisterForanAffiliateAccount;
	@FindBy(xpath="//input[@name='company']")
	private WebElement CompanyNameForAffiliateAccount;
	@FindBy(xpath="//input[@name='website']")
	private WebElement EnterWebsiteForaffiliateAccount;
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement EnterTaxId;
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement paymentmethod;
	@FindBy(xpath= "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]/label/input")
	private WebElement chequebutton;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[2]/label/input")
	private WebElement paypalbutton;
	@FindBy(xpath="//input[@value='bank']")
	private WebElement BankTransferButton;
	@FindBy(xpath="//*[@id=\"input-cheque\"]")
	private WebElement chequePayName;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]/label/input")
	private WebElement aboutUsCheckbox;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continuebutton;
	@FindBy(xpath="/html/body/div[2]/div[1]")
	private WebElement successMessageforaffiliate;
	@FindBy(xpath="//*[@id=\"content\"]/ul[3]/li[1]/a")
	private WebElement EditAffiliateAccount;
	
	@FindBy(xpath="//input[contains(@value,'bank')]")
	private WebElement clickOnBankTrnasferbutton;
	@FindBy(xpath="//input[@name='bank_name']")
	private WebElement EnterBankName;
	@FindBy(xpath="//input[@name='bank_branch_number']")
	private WebElement EnterAbaNumber;
	@FindBy(xpath="//input[@name='bank_swift_code']")
	private WebElement EnterSwiftCode;
	@FindBy (xpath="//input[@name='bank_account_name']")
	private WebElement EnteraccountName;
	@FindBy(xpath="//input[@name='bank_account_number']")
	private WebElement EnteraccountNumber;
	@FindBy (xpath="//input[contains(@type,'submit')='bank_account_number']")
	private WebElement clickOnContinueButton;
	
	//scenario 4:
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement clickOnEditAccountInformationLink;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstNameForAccountEdit;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastNameForAccountEdit;
	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailforAccountEdit;
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement phoneNumberForAccountEdit;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement ClickOnContinuebuttonAfterEdit;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']/text()")
	private String GetMessageAfteraccountEdit;
	
	
	//scenario 1
	
	public String getTextfromUI() {
		
		String getTextOfUI = RetailPageText.getText();
		return getTextOfUI;
	}
	
	public void ClickonAccount () {
		Myaccount.click();
	}
	public void clickOnlogin() {
		Login.click(); 
	}
	public boolean isLogopresent() {
		if (RetailPageText.isDisplayed())
		return true;
		else
			return false;
	}
	 public void enterUserNameAndPassword (String username , String password) {
		 UserName.sendKeys(username);	 
		 Password.sendKeys(password);
		 
	 }
	
		 
	 public void ClickonLoginButton() {
		 logingButton.click();
		 
	 }
	 public boolean getTextFromDashboard() {
		 
		if(TextOnAccountDashboard.isDisplayed())
		
		return true;
		else 
			return false;
	 }
	 
	 //scenario 2
	 public void clickOnAffiliateAccountLink() {
		 RegisterForanAffiliateAccount.click();
		 
	 }
	 public void companyNameForAffiliateAccount(String company) {
		 CompanyNameForAffiliateAccount.sendKeys(company);
			 
	 }
	 public void WebSiteForAffiliateAccount(String Website) {
		 EnterWebsiteForaffiliateAccount.sendKeys(Website);
		 
	 }
	 public void taxIDforAffiliateAccount(String taxID) {
		 EnterTaxId.sendKeys(taxID);
		 
	 }
	 public void SelectPaymentMethod(String PaymentType) {
		 if (PaymentType.trim().equalsIgnoreCase("Cheque")) {
			 if (!chequebutton.isSelected()) {
				 chequebutton.click();
			 }
			 else if (PaymentType.trim().equalsIgnoreCase("paypal"))
				 paypalbutton.click();
			 else
				 BankTransferButton.click();
		 }	
		 }
		 public void enterpayPalEmail(String payPalemailaccount) {
		 paypalbutton.sendKeys(payPalemailaccount);
	 }
		 public void checktheAboutUsBox() {
			 aboutUsCheckbox.click();
		 }
		 public void clickonContinuebutton() {
			 continuebutton.click();
		 }
		 public boolean isSuccessMessagepresent() {
			 if (successMessageforaffiliate.isDisplayed())
				 return true;
			 else
				 return false;
			 
		 }
		 public void clickOnEdityourAffiliateAccount() {
			 EditAffiliateAccount.click();
		 }
		 public void clickOnBankTransferbutton() {
			 clickOnBankTrnasferbutton.click();
		 }
	 
	 public void BankName(String bankName) {
		 EnterBankName.sendKeys(bankName);
	 }
	 public void abaNumber(String abaNumber) {
		 
		 EnterAbaNumber.sendKeys(abaNumber); 
	 }
	 public void SwifCode(String SwiftCode) {
	 
	 EnterSwiftCode.sendKeys(SwiftCode);
	 
	 }
	 
	 public void AccountName(String accountName) {
		 EnteraccountName.sendKeys(accountName); 
	 }
	 
	 public void AccountNumber(String accountNumber) {
		 EnteraccountNumber.sendKeys(accountNumber); 
	 }
	 
	public void clickOncontinueButtonafterEdit() {
		clickOnContinueButton.click();
	}
	
	
	 //scenario 4:
	 
	 public void clickOnAccountEditlink() {
		 
		 clickOnEditAccountInformationLink.click(); 
	 }
	
	 
	 public void FirstNameForAccountEdit(String firstName) {
		 FirstNameForAccountEdit.sendKeys(firstName); 
	 }
	 public void lastNameForAccountEdit(String lastName) {
		 LastNameForAccountEdit.sendKeys(lastName);
	 }
	 public void EmailAddrassForAccountEdit(String email) {
		 EmailforAccountEdit.sendKeys(email);
	 }
	 public void PhoneNumberForAccountEdit(String telephone) {
		 phoneNumberForAccountEdit.sendKeys(telephone);
		 
	 }
	 public void ClickOnContinueAfterEditAccount() {
		 ClickOnContinuebuttonAfterEdit.click();
	 }
	 public String getMessageAfterAccountEdit() {
		return GetMessageAfteraccountEdit;
	 }
	 
	
	 
	 }
