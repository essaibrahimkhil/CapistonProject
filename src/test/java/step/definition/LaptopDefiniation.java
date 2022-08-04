package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.laptopAndnotpadPageObj;

public class LaptopDefiniation extends Base {
	laptopAndnotpadPageObj lapObj = new laptopAndnotpadPageObj();
	
	
		@When("User click on Laptop and NoteBook tab") 
			public void User_click_on_Laptop_and_NoteBook_tab() {
			lapObj.userclickOnLaptop();
			logger.info("User clicked on laptop");
			
		}
			
			
		
		@And("User click on Show all Laptop and NoteBook option")
		public void User_click_on_Show_all_Laptop_and_NoteBook_option () {
			lapObj.clickOnshowAlllaptop();
			logger.info("User click on show all Laptop option");
			
			
		}
		@And("User click on MacBook item") 
			public void User_click_on_MacBook_item() {
			lapObj.clickOnMacBookitem();
			logger.info("User click on Mac item");
			
				
		
			}
		
		@And("User click add to cart button") 
		public void User_click_add_to_cart_button() {
		lapObj.clickAddtoCartButton();
		logger.info("User add it to cart button");
	
		
		}
		@Then("User should See a message {string}")
		public void User_should_see_a_Message(String string) {
			lapObj.MessageForAddtoCart();
			logger.info("User successfully add to cart");
			
		}
			
		
		@And("User should see {string} showed to the cart")
		public void User_should_see_showed_to_the_cart(String string) {
			lapObj.item602();
			logger.info("one item showed to the cart");
			
		}
			
		@And("User click on cart option")
		public void User_click_on_cart_option () {
			lapObj.clickOnCartOption();
			logger.info("user clicked on cart option");
			
		}
		
		
		
		@And("user click on red X button to remove the item from cart")
		public void user_click_on_red_X_button_to_remove_the_item_from_cart() {
			lapObj.clickOnRedXbutton();
			logger.info("User click on X button");
		
		}
			
		
		@Then("item should be removed and cart should show {string}")
			public void item_should_be_removed_and_cart_should (String string) {
			lapObj.itemsremovedFromChart();
			logger.info("item removed");
			
			}
		//scenario 2
	
		
	
		@And ("User click on product comparison icon on {string}")
		public void User_click_on_product_comparison_icon_on(String string) {
			lapObj.clickOnProductComprison();
			lapObj.ClickOnproductComprisonforMacAir();
			logger.info("User click on comprison");
			logger.info("User click on comprison for MacAir");
			
			
		}
		
	
		
			
		
	
	
		
			
		
		
		@Then ("User should see Product Comparison Chart")
		public void User_should_see_Product_Comparison_Chart () {
			lapObj.ComprisonChart();
			logger.info("user see comprison chart");
			
		}
		@And ("User click on heart icon to add {string} laptop to wish list")
		public void User_click_on_heart_icon_to_add_laptop_to_wish_list (String string){
			lapObj.ClickhearticonforAddingSony();
			logger.info("user click on Heart button");
			
			
		}
		@Then ("User should get a message {string}")
		public void User_should_get_a_message (String actual) {
			lapObj.successMessageforSony();
			
			logger.info("You must login or create an account to save Sony VAIO to your wish list!");
			
			
		}
		@And ("User click on {string} item")
		public void User_click_on_item (String String){ 
			lapObj.MacBookPro();
		}
		
		
		@Then("User should see {string} price tag is present on UI")
		public void User_should_see_price_tag_is_present_on_UI(String string) {
			lapObj.UItagPrice();
			logger.info("user click on 2,000,000 item");
		
		}
			
		}
	
	
	


