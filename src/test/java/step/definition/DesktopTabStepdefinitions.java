package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DesktopsTabPageObj;
import utilities.Util;


public class DesktopTabStepdefinitions extends Base {
	DesktopsTabPageObj Desktopobj = new DesktopsTabPageObj();

//BACKGROUND
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {

		Desktopobj.clickOnDesktop();
		logger.info("User Successfully Click on Desktop");
		
	}

	@When("User click on show all deskptops")
	public void user_click_on_show_all_deskptops() {
		Desktopobj.clickOnshowAllbutton();
		logger.info("User Successfully Click on show all Desktop");
		
	}

//Scenario 1
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	List<WebElement> DesktopElement = Desktopobj.DesktopsItems();
	for(WebElement element:DesktopElement) {
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("title") +"User successfully see all Items in desktop");
		
	}
	}

//fail
	@And("User click ADD TO CART option on HP LP3065 item")
	public void User_click_ADD_TO_CART_option_on_HP_LP3065_item() {
		Desktopobj.addLaptoptocart();
		logger.info("User Successfully Click on add the laptop button");
		
	}

	@When("User select quantity")
	public void user_select_quantity() {

		Desktopobj.QuantityofLaptop();
		logger.info("user successfully select quantity {String}");
		
	}

	@When("User add to Cart button")
	public void User_add_to_cart_button() {
		Desktopobj.clickOnaddtocartButton();
		logger.info("User successfully click on add to cart button for laptop");
		

	}

    @Then("User should see a Message {string}")
    public void User_should_see_a_message(String expectedTextMessage) {
    	Assert.assertEquals(Desktopobj.GettextAfterLaptopaddedtoCart(),expectedTextMessage);
    	Assert.assertTrue(Desktopobj.isSuccessMessagePresent());
	    logger.info(expectedTextMessage + "equels to " + Desktopobj.GettextAfterLaptopaddedtoCart() );
	 
    }

//fail

	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		Desktopobj.ClickOncamera();
		logger.info("User successfully click on camera");
	    

	}

	@When("User select Red color from dropdown")
	public void user_select_red_color_from_dropdown() {

		Desktopobj.SelectRedColor();
		logger.info("User select red color");
		

	}

	@When("User select quantity {string}")
	public void User_select_quantity(String string) {
		Desktopobj.SelectQuantity1();
		logger.info("User send the quantity");
		

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_Button() {
		Desktopobj.clickOnaddTocartbutton();
		logger.info("User sucessfully click on add to cart button");
	

	}

	@Then("User see a Message {string}")
	public void  User_see_a_Message (String string){
		Desktopobj.SucessTextforLaptop();
		logger.info("User successfully get sucess text");
		
		
	}
//scenario 4
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		Desktopobj.ClickOncamera();
		logger.info("User successfully click on camera");
		
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		Desktopobj.ClickOnReviewlink();
		logger.info("User successfully click on review link");
	
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> Reviewdata = dataTable.asMaps(String.class,String.class);
		Desktopobj.NameforReview(Reviewdata.get(0).get("Yourname"));
		Desktopobj.ReviewRate(Reviewdata.get(0).get("YourReview"));
		Desktopobj.Rate(Reviewdata.get(0).get("Rating"));
		
		logger.info("user fill the review information");
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		Desktopobj.ClickOncontinuebutton();
		logger.info("User successfully click on continue button");
		
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		Desktopobj.GeTextAfterReview();
		logger.info("User sucessfully see the message");
	
	}

}