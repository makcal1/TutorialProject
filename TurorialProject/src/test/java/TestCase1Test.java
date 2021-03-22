import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hostel.base.BasePage;
import com.hostel.pages.TestCase1;

public class TestCase1Test extends BasePage{
	// fields, driver, properties, basepageObj, LoginpageObj, 
WebDriver driver;
BasePage basePage;
Properties properties;
TestCase1 testCase;
//
//@BeforeTest
//public void setUp () throws InterruptedException {
//basePage = new BasePage();
//properties = basePage.initialize_properties();
//driver = basePage.initialize_driver();
//testCase = new TestCase1(driver);
//	
//testCase.firstSetUp();	
//	
//testCase.secondSetUp();	
//}
@Test

@Parameters("myName")

public void selection(String myName) {

System.out.println("test passed");
System.out.println("Parameterized value is : " + myName);
	
	
}
//@AfterTest
//public void tearUp() {
//	
//driver.close();	
//	
//	
//	
//}
}
