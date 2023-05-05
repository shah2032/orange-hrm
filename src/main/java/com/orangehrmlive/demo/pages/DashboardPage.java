package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText= By.xpath("//h6[normalize-space()='Dashboard']");
    By app = By.xpath("//img[@alt='client brand banner']");
    By logo = By.xpath("//body/nav[1]/div[1]/a[1]/img[1]");
    public String getTextDashboard(){
        return getTextFromElement(dashboardText);
    }
    public void launchTheApplication(){
        clickOnElement(app);
    }
    public String getTextFromLogo(){
        return getTextFromElement(logo);
    }

}
