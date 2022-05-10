package com.demo.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pages.LoginPage;
import com.demo.utilities.ExcelUtility;
import com.demo.constants.AutomationConstant;



public class TestClass extends TestBase {
	
LoginPage objLogin;
	
	@Test(priority=1)
    public void verifyValidLogin() throws Exception {
    //Create Login Page object
    objLogin = new LoginPage(driver);
    //login to application

    String username = ExcelUtility.getCellData(0, 0);
    String password = ExcelUtility.getCellData(0, 1);
    objLogin.setUserName(username);
    Thread.sleep(500);
    objLogin.setPassword(password);
    Thread.sleep(500);
    objLogin.clickLogin();
    String expectedTitle =AutomationConstant.HOMEPAGETITLE;
    String actualTitle =driver.getTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
    }


}
