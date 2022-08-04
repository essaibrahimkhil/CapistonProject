package step.definition;
import java.util.List;
import java.util.Map;
import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObject.RetailPageObject;

public class RetailStepDefinition extends Base {
	RetailPageObject Pageobj = new RetailPageObject();
	
	//scenario 1:
	
	@Given ("User is on Retail website")
	public void User_is_on_Retail_website() {
	String expectedlogo = "TEST ENVIRONMENT";
	String Actuallogo = Pageobj.getTextfromUI();
	Assert.assertEquals(expectedlogo, Actuallogo);
	logger.info("Text in UI verified");
	
	
		}
	
	
	@And ("User click on MyAccount")
    public void User_click_on_MyAccount() {
		Pageobj.ClickonAccount();
		logger.info("User successfully clicked on My account");
		}
	@When("User click on Login")
		public void User_click_on_Login() {
		Pageobj.clickOnlogin();
		logger.info("User successfully clicked on log in page");
		
		}
	@And("User Enter username {string} and Password {string}")
	public void User_Enter_username_and_Password(String username, String password) {
		Pageobj.enterUserNameAndPassword("ibrahimkhil@tek.com", "ibrahimkhil");
		logger.info("Username and password entered seuccessfully");
	
		
	}
	@And ("User Click on Login button")
	public void User_Click_on_Login_button() {
		Pageobj.ClickonLoginButton();
		logger.info("User successfully clicked on loging button");
	}
	@Then ("User should be logged in to MyAccount dashboard")
	public void User_should_be_logged_in_to_MyAccount_dashboard() {
		Pageobj.getTextFromDashboard();
		logger.info("text successfully got it from dashboard");
		
		
		}
	



@When("User Click on Register for an Affiliate Account Link")
public void User_Click_on_Register_for_an_Affiliate_Account_Linkk() {
	
	Pageobj.clickOnAffiliateAccountLink();
	logger.info("successfully click on Affiliate Account");
 
}

@When("User fill affiliate form with below information")
public void User_fill_affiliate_form_with_below_information(DataTable dataTable) {
	
	 List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
	   Pageobj.companyNameForAffiliateAccount(data.get(0).get("company"));	   
	   Pageobj.WebSiteForAffiliateAccount(data.get(0).get("website"));
	   Pageobj.taxIDforAffiliateAccount(data.get(0).get("taxID"));
	   Pageobj.SelectPaymentMethod(data.get(0).get("paymentMethod"));
	   Pageobj.enterpayPalEmail(data.get(0).get("payeeName"));
	   logger.info("User Sucessfully Fill Affiliate Account");
	  
	   
}

@When("User check on About us check box")
public void User_check_on_About_us_check_box() {
	
	Pageobj.checktheAboutUsBox();
	logger.info("User successfully check the box");
	
   
}

@When("User click on Continue button")
public void User_click_on_Continue_button() {
	Pageobj.clickonContinuebutton();
	logger.info("User successfully click on continue button");
	
    
}

@Then("User should see a success message")
public void User_should_see_a_success_message() {
	Pageobj.isSuccessMessagepresent();
	logger.info("user successfully get success message");

}

//scenario 3:


@When("User click on Edit your affiliate information link")
public void User_click_on_Edit_your_affiliate_information_link() {
	Pageobj.clickOnEdityourAffiliateAccount();
	logger.info("User Successfully Clic kOn Account Edit link");
	
	
   
}

@When("user click on Bank Transfer radio button")
public void user_click_on_Bank_Transfer_radio_button() {
	
	Pageobj.clickOnBankTransferbutton();
	logger.info("User successfully click on Transfer Radio Button");

   
}

@When("user fill Bank information with below information")
public void user_fill_Bank_information_with_below_information(DataTable dataTable) {
	 List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
	   Pageobj.BankName(data.get(0).get("bankName"));	   
	   Pageobj.abaNumber(data.get(0).get("abaNumber"));
	   Pageobj.SwifCode(data.get(0).get("SwiftCode"));
	   Pageobj.AccountName(data.get(0).get("accountName"));
	   Pageobj.abaNumber(data.get(0).get("accountNumber"));
	   logger.info("User Successfully Edit Affiliate Account");
	
	
}


//scenario 4:


@When("User click on Edit your account information link")
public void User_click_on_Edit_your_account_information_link() {
	
	Pageobj.clickOnAccountEditlink();
	logger.info("User Successfully click on Edit account information link");
	
   
}

@When("User modify below information")
public void User_modify_below_information(DataTable dataTable) {
   List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		   Pageobj.FirstNameForAccountEdit(data.get(0).get("firstName"));	   
		   Pageobj.lastNameForAccountEdit(data.get(0).get("lastName"));
		   Pageobj.EmailAddrassForAccountEdit(data.get(0).get("email"));
		   Pageobj.PhoneNumberForAccountEdit(data.get(0).get("telephone"));
		   logger.info("User successfully modify Account");
		   
}

@When("user click on Continue button After Bank Information")
public void user_click_on_Continue_button_After_Bank_Information() {
	
	Pageobj.ClickOnContinueAfterEditAccount();
	logger.info("User click on Continue After Edit Account");

    
}

@Then("User should see a success message After Affiliate Information Edit")
public void User_should_see_a_success_message_After_Affiliate_Information_Edit() {
	
	Pageobj.getMessageAfterAccountEdit();
	
	logger.info("User successfully get Message after Accont Edit ");
	
   
}
     @And("User click on continue button After Account information Edit")
     public void And_User_click_on_continue_button_After_Account_information_Edit() {
    	 Pageobj.ClickOnContinueAfterEditAccount();
    	 logger.info("user click on continue button after account edit");
    
    	 
     }
     @Then("User see a message {string}")
 	public void User_see_a_message (String string) {
    	 Pageobj.getMessageAfterAccountEdit();
    	 logger.info("user should see The Message");
    	
    	 
    	 
    	 
    	 
    	 
     }


	}