package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Util;

public class DesktopsTabPageObj extends Base {
	public DesktopsTabPageObj () {
	
	PageFactory.initElements(driver, this);
	
}
	//background:
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement clickOndesktoptab;
	
    @FindBy(xpath="//a[text()='Show All Desktops']")
     private WebElement ShowAllDesktops;
    
    //scenario 1:
    
    @FindBy(tagName="img")
    private List <WebElement> items;
    
    //@fail
    
    @FindBy(xpath="//a[text()='HP LP3065']")
    private WebElement AddoptionforHplaptop;
    @FindBy(xpath="//*[@name=\"quantity\"]")
    private WebElement selectQuantity;
    @FindBy(xpath="//*[@id=\"button-cart\"]")
    private WebElement AddtoCartbutton;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    private WebElement CartaddMessage;
     //endoffail
    //scernario3:
    
    @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
    private WebElement CanonCameraToCart;
    @FindBy(xpath="//select[@id=\"input-option226\"]/option[2]")
    private WebElement SelectColorforCamera;
    @FindBy(xpath="//input[@name='quantity']")
    private WebElement QuantityForCamera;
    @FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]/i")
    private WebElement cartaddingButton;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    private WebElement SuccessMassageForLaptop;
    
    //scenario 4:
    @FindBy(xpath="//img[contains(@title,'Canon EOS 5D Camera')]")
    private WebElement clickOnCanonCamera;
    @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")
    private WebElement ReviewLink;
    @FindBy(xpath="//input[@id='input-name']")
    private WebElement  NameForReview;
    @FindBy(xpath="//*[@id=\"input-review\"]")
    private WebElement MyReview;
    @FindBy(xpath="//input[4][@type='radio']")
    private List<WebElement> ReviewRate;
    @FindBy(xpath= "//*[@id=\\\"form-review\\\"]/div[2]")
    private String seeAprovalMessage;
    
    @FindBy(xpath="//button[@id='button-review']")
    private WebElement clickOnContinuebuttonAfterReview;
    
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']/text()")
    private String SucessTextAfterReview;
    
// background

      public void clickOnDesktop() {
    	  Util.hoveMouseOverElement(clickOndesktoptab);
    	  
      }
      public void clickOnshowAllbutton() {
    	  ShowAllDesktops.click();
      }
      
      //scenario 1:
      
      public List<WebElement> DesktopsItems(){
    	  
    	  List<WebElement> ItemsDesktop = items;
    	  return ItemsDesktop;
    			
      }
      // @fail
      public void addLaptoptocart() {
    	  AddoptionforHplaptop.click();
      }
      
      public void QuantityofLaptop() {
    	  selectQuantity.isSelected();
    	 
    	  
      }
      public void clickOnaddtocartButton() {
    	  AddtoCartbutton.click(); 
      }
      
     // @endofail
      
      
      public String GettextAfterLaptopaddedtoCart() {
    	 String ActualResult= SuccessMassageForLaptop.getText();
    	 return ActualResult;
      }
      public boolean isSuccessMessagePresent() {
    	  if(SuccessMassageForLaptop.isDisplayed())
    		  return true;
    	  else
    		  return false;
      }
      
      //3
      
      public void AddCanonCameratoCart() {
    	  CanonCameraToCart.click();
      }
      
     public void SelectRedColor() {
    	 SelectColorforCamera.click();
     }
     public void SelectQuantity1() {
    	 QuantityForCamera.sendKeys("1");
    	 
     }
     public void clickOnaddTocartbutton() {
    	 cartaddingButton.click();
     }
     
     public String SucessTextforLaptop() {
    	return SuccessMassageForLaptop.getText();
    	
     }
      //scenario 4:
      public void ClickOncamera() {
    	  clickOnCanonCamera.click();
      }
      public void ClickOnReviewlink() {
    	  ReviewLink.click();
      }
      public void NameforReview(String Yourname) {
    	  NameForReview.clear();
    	  NameForReview.sendKeys(Yourname);
    	  
      }
      public void ReviewRate(String YourReview) {
    	  MyReview.clear();
    	  MyReview.sendKeys(YourReview);  
      }
      public void Rate (String Rating) {
    	  List<WebElement> ratingElement = ReviewRate;
    	  for (WebElement element : ratingElement ) {
    		  if (element.getAttribute("value").equalsIgnoreCase(Rating.trim())) {
    			  element.click();
    			  break;
    		  }
    	  }
    	  
      }
      public void ClickOncontinuebutton() {
    	  clickOnContinuebuttonAfterReview.click();  
      }
      public String GeTextAfterReview () {
      return SucessTextAfterReview;
     
}

}