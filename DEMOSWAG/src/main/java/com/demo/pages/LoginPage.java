package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
    */
   WebDriver driver;
   
   @FindBy(id="user-name")
   private WebElement username;
   @FindBy(id="password")
   private WebElement password;    
   @FindBy(id="login-button")
   private WebElement login;
   @FindBy(xpath = "//div[@class='error-message-container error']/*")
   public WebElement errorMessage;
  
    
   public LoginPage(WebDriver driver){
       this.driver = driver;
       //This initElements method will create all WebElements
       PageFactory.initElements(driver, this);
   }
       
 //Set user name in text box
   
   public void setUserName(String strUserName){
   	{
   	username.sendKeys(strUserName);     
   }
   }

 //Set password in password text box
   public void setPassword(String strPassword){
      password.sendKeys(strPassword);
   }

  
       //click on login button
       
       public void clickLogin() {
       
       	login.click();
       }
       //clear user name
       public void clearusername(){
       	username.clear();
       }
       //clear password
       public void clearpassword(){
       	password.clear();
       }
       

}
