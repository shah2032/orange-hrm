package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

LoginPage loginPage = new LoginPage();
DashboardPage dashboardPage = new DashboardPage();
@Test
    public void verifyUserShouldLoginSuccessFully(){
    // Enter username
    loginPage.enterUserName();
    //  Enter password
    loginPage.enterPassword();

  //  Click on Login Button
    loginPage.clickOnLogin();
    // Verify "Dashboard" Message
    Assert.assertEquals(dashboardPage.getTextDashboard(),"Dashboard","Message Not found");
}
@Test
    public void  VerifyThatTheLogoDisplayOnLoginPage(){
    // Enter username
    loginPage.enterUserName();
    //  Enter password
    loginPage.enterPassword();

    //  Click on Login Button
    loginPage.clickOnLogin();

    dashboardPage.launchTheApplication();
   // Assert.assertEquals(dashboardPage.getTextFromLogo(),"OrangeHRM","logo not match");



}


}