package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
   By search = By.xpath("//div[@class='oxd-main-menu-search']//*[name()='svg']") ;
   By admin = By.xpath("//li[1]//a[1]//span[1]");
   By pim = By.xpath("//span[normalize-space()='PIM']");
   By leave = By.xpath("//span[normalize-space()='Leave']");
   By dashboard= By.xpath("//span[normalize-space()='Dashboard']");
   public void clickOnAdmin(){
      mouseHoverToElementAndClick(admin);
   }
  public void mouseHoverOnSearch(){
      mouseHoverToElement(search);

  }

 }

