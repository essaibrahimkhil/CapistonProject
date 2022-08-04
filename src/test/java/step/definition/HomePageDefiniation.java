package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.HomePageObj;

	public class HomePageDefiniation extends Base {
		HomePageObj Obj = new HomePageObj ();
		
		@When ("User click on Currency")
		public void User_click_on_Currency() {
			Obj.clickOnCurrancy();
			logger.info("User click On currency");
			
		}
			@And ("User Choose Euro from dropdown")
			public void User_Choose_Euro_from_dropdown() {
				Obj.ChooseFromDropDown();
				logger.info("User choose Euro");
				
			}
			@Then ("currency value should change to Euro")
			public void currency_value_should_change_to_Euro() {
				Obj.currencyChange();
				logger.info("Currency changed to Euro");
				
			}
			@When ("User click on shopping cart") 
			public void User_click_on_shopping_cart () {
				Obj.clickOnShoppingcart();
				logger.info("User click on shoping cart");
				
			}
			@Then ("{string} message should display")
			public void message_should_display (String expectedmessage){
				Assert.assertTrue(Obj.getEmptyshopingCartMessage());
				logger.info("Message displayed");
				
			}
		}



