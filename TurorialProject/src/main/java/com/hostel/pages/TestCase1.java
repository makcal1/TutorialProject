package com.hostel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hostel.base.BasePage;
import com.hostel.util.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 extends BasePage {

	
//PATH	

By alertHandleBtn = By.xpath("//*[@id='cookie-policy-banner-container']/div/button");
By languageSelectionBtn = By.xpath("/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/ul[1]/li[2]/button[1]");
By englishBtn=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[15]/a[1]/span[1]");
By locationBtn=By.id("qf-0q-destination");
By searchBtn=By.xpath("//button[@type='submit']");
By guestBtn= By.xpath("//span[@class='rIhyt1']");
By adultSctn=By.xpath("//select[@name='q-room-0-adults']");
By adulSelectionBtn=By.xpath("//*[@id='modal-panel-oc-0']/section/div[2]/div[1]/div/div[1]/div/div/select/option[2]");
By childBtn=By.xpath("//select[@name='q-room-0-children']");
By childSelectionBtn=By.xpath("//*[@id='modal-panel-oc-0']/section/div[2]/div[1]/div/div[2]/div/div/select/option[3]");
By ageofChildBtn=By.xpath("q-room-0-child-0-age");
By ageSelection=By.xpath("//*[@id='q-room-0-child-0-age']/option[12]");
By ageofChild2Btn=By.xpath("//select[@name='q-room-0-child-1-age']");
By child2ageSelection=By.xpath("//*[@id='q-room-0-child-1-age']/option[12]");
By applyBtn= By.xpath("//button[normalize-space()='Apply']");	
By star3=By.xpath("//label[normalize-space()='3']");
By tik=By.xpath("//*[@id='hds-marquee']/div[2]/div/div/form/div[4]/button");
By ikinci = By.xpath("/html/body/div[8]/table/tfoot/tr/td[2]/button");

	// fields : driver,locators
	   WebDriver driver;
		ElementUtil elementUtil;
		
		
			public TestCase1(WebDriver driver) {
				
				this.driver = driver;
				elementUtil = new ElementUtil(driver);
			
			
			}public void firstSetUp() throws InterruptedException {
				
			elementUtil.doClick(alertHandleBtn);	
			
			
		//	elementUtil.doClick(languageSelectionBtn);
			
			
			
		//	Thread.sleep(3000);
		//	elementUtil.doClick(englishBtn);
			
			
			
			}public void secondSetUp() throws InterruptedException {
			//elementUtil.doClick(locationBtn);
			
			//Thread.sleep(3000);
			
			
			
			
	elementUtil.doSendKeys(locationBtn, " Boston, Massachusetts, United States of America");
	elementUtil.doClick(ikinci);
	elementUtil.doClick(searchBtn);
	
//
//elementUtil.doClick(guestBtn);
//
//elementUtil.doClick(adulSelectionBtn);
//elementUtil.doClick(childBtn);
//
//elementUtil.doClick(childSelectionBtn);
//
//elementUtil.doClick(adulSelectionBtn);
//
//elementUtil.doClick(ageofChild2Btn);
//
//elementUtil.doClick(child2ageSelection);
//
//elementUtil.doClick(applyBtn);

elementUtil.doClick(searchBtn);

elementUtil.doClick(star3);
elementUtil.doClick(searchBtn);

			}
	
			
			
	

	
}
