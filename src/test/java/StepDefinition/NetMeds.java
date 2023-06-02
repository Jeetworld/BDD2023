package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NetMeds {
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--disable-notifications");
	WebDriver driver;
	
	@Before
	public void setUp() {
//		 driver = new ChromeDriver();
//		 driver.get("https://sit-rwos.netmeds.com/rwos/#/login");
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			driver.manage().getCookies();
	}
	
	
	@Given("I have {string} and {string}")
	public void i_have_and(String username, String password) throws Exception {
	
		
	try {
		driver = new ChromeDriver();
		 driver.get("https://sit-rwos.netmeds.com/rwos/#/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().getCookies();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(username.trim());
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password.trim());
		WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		WebElement ele1= driver.findElement(By.xpath("//*[contains(text(),'User KEERTHIKA already logged in, click Yes to logout previous session and continue')]"));
		try {
			if(ele1.isDisplayed());
			System.out.println("Session warning is showing");
			
		}
		catch(Exception exc) {
			
			System.out.println("Session warning is not showing");
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ui-button-text ui-clickable'  and text()='Yes']"))).click();
		
	}catch(Exception ex) {
		try {
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id='errorMsg']"));
		if(errorMsg.isDisplayed()) {
			throw new Exception(" Invalid credentials enter ");
		}
			
		}
	catch(Exception ee) {
		if(ee.getMessage().contains(" Invalid credentials enter ")) {
			throw new Exception(" Invalid credentials enter ");
		}
		else
			System.out.println(" ignore exception ");
	}
		
	}
	//driver.quit();
	}
	@When("I enter the cred and it shows me warning or not")
	public void  i_enter_the_cred_and_it_shows_me_warning_or_not() {
		
		
	
	}
	@Then("it should show corresponding page")
	public void it_should_show_corresponding_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
