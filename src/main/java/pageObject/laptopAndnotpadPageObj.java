package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class laptopAndnotpadPageObj extends Base {
	public laptopAndnotpadPageObj () {
		PageFactory.initElements(driver, this);
	}
	//Background
 @FindBy(xpath="//a[text()='Laptops & Notebooks']")
 private WebElement ClickOnLaptopAndnotepadTab;

  @FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
  private WebElement clickOnshowAllLaptopOption;
  
  //Scenario 1
  @FindBy(xpath="//a[text()='MacBook']")
  private WebElement MacBookItem;
  @FindBy(xpath="//button[@id='button-cart']")
  private WebElement AddtoCartbuttonforLaptop;
  @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
  private WebElement LaptopaddcartsucessMessage;
  @FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
  private String ItemshowedInCart;
  @FindBy(xpath="//span[@id='cart-total']")
  private WebElement clickOncartOption;
  @FindBy(xpath="//i[@class='fa fa-times']")
  private WebElement ClickOnXbutton;
  @FindBy(xpath="//span[@id='cart-total']")
  private String ItemRemoved;
//scenario 2 
  @FindBy(xpath="/html/body")
  private WebElement ProductComparisonMac;
  @FindBy(xpath="/html/body")
  private WebElement ProductComparisonMacAir;


  @FindBy(xpath="//div[@id='content']")
  private String ComparisonChart;
  //Scenario 3
  @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
  private WebElement SonyLaptop;
  @FindBy(xpath="//a[text()='Sony VAIO'][1]")
  private WebElement successmessageforSonyLaptop;
  
  //Scenario 4
  @FindBy(xpath="//img[contains(@title,'MacBook Pro')]")
  private WebElement ClickonMacBookPro;
  @FindBy (xpath="/html/body/div[2]/div/div/div/div[2]/ul[2]/li[1]/h2")
  private WebElement MacBookpriceOnUI;
  
  public void userclickOnLaptop() {
	  
	  ClickOnLaptopAndnotepadTab.click();
	  
  }
  public void clickOnshowAlllaptop() {
	  
	  clickOnshowAllLaptopOption.click();
	  
  }
  //scenario:1
  public void clickOnMacBookitem() {
	  MacBookItem.click(); 
  }
  public void clickAddtoCartButton() {
	  AddtoCartbuttonforLaptop.click();
  }
  public String MessageForAddtoCart() {
	  
	String actualmessage = "success:you added" + LaptopaddcartsucessMessage.getText()
	+ "to your shopping cart!";
	return actualmessage;
  }
 
  
   public String item602() {
   return ItemshowedInCart;
}
  
  public void clickOnCartOption() {
	  clickOncartOption.click();
  }
  
  public void clickOnRedXbutton() {
	  ClickOnXbutton.click();
  }
  public String itemsremovedFromChart() {
	
	 return ItemRemoved;
  } 
  //scenario 2:
  
  public void clickOnProductComprison() {
	  ProductComparisonMac.click();
  }
  public void ClickOnproductComprisonforMacAir() {
	  ProductComparisonMacAir.click();
  }
 
  

  
  public String ComprisonChart(){
	  
	  return ComparisonChart;
	  
	  //scenario 3:

  }
  public void ClickhearticonforAddingSony() {
	  SonyLaptop.click();
  }
  public String successMessageforSony() {
  
  String MessageforSony = successmessageforSonyLaptop.getText();
  return MessageforSony;
  }
  //scenario 4:
  
  public void MacBookPro() {
	  ClickonMacBookPro.click();
  }
  
 public boolean UItagPrice() {
	 if(MacBookpriceOnUI.isDisplayed())
		 return true;
	 else
		 return false;
 }
  
  
  
  
  

  
  }