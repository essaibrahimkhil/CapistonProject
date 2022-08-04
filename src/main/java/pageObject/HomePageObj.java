package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

	public class HomePageObj extends Base {
		public HomePageObj () {
			PageFactory.initElements(driver, this);
		}
		//Scenario 1:
		@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
		private WebElement Currency;
		@FindBy(xpath="//button[@name='EUR']")
		private WebElement Euro;
		@FindBy(xpath="//form[@id=\"form-currency\"]/div/button/strong")
		private WebElement currencychange;
		
		//scenario 2:
		
		@FindBy(xpath="//div[@id=\"top-links\"]/ul/li[4]/a/i")
		private WebElement clickOnShoppingCart;
		@FindBy(xpath="//div[@id=\"content\"]/p")
		private WebElement shoppingCartMessage;
	

	
  public void clickOnCurrancy() {
	  Currency.click();
  }
  public void ChooseFromDropDown() {
	 Euro.click();
  }
  public String currencyChange() {
	 String actualValue =Euro.getText() +"currency";
	 return actualValue;
  }
  public void clickOnShoppingcart() {
	  clickOnShoppingCart.click(); 
  }
 
	   
  
  public boolean getEmptyshopingCartMessage() {
	  if(shoppingCartMessage.isDisplayed())
		  return true;
	  else
		  return false;
  }
	  
  }
	  