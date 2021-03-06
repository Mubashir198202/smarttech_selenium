package zoopla.uk.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.baseclass.SuperClass;

public class MasterPagefactory extends SuperClass {
	
public MasterPagefactory() {
	
	PageFactory.initElements(driver, this);
}

  @FindBy(xpath="//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
 private WebElement acceptCookis;

public WebElement getAcceptCookis() {
	return acceptCookis;
}
  
  @FindBy (linkText="Sign in")
  private WebElement clickSignInButton;

public WebElement getClickSignInButton() {
	return clickSignInButton;
}
@FindBy (id ="signin_email")
private WebElement enterusername;

public WebElement getEnterusername() {
	return enterusername;
}  
 
@FindBy (id ="signin_password")
private WebElement enterpassword;

public WebElement getEnterpassword() {
	return enterpassword;
}

@FindBy (id ="signin_submit")
private WebElement clickloginbutton;

public WebElement getClickloginbutton() {
	return clickloginbutton;
}
  
  
  
}
