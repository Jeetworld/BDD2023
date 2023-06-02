package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NetMedsIQ {
	WebDriver driver;
	@Given("I navigate to netmeds app")
	public void i_navigate_to_netmeds_app() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	}
	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) throws Exception {
		try {
			//driver = new ChromeDriver();
			 driver.get("https://sit-rwos.netmeds.com/rwos/#/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().getCookies();
			driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(username.trim());
			System.out.println("Username entered");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password.trim());
			System.out.println("Password entered");
			WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
			System.out.println("clicked on checkbox");
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
			System.out.println("Sign in button clicked");
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
	@Then("it should show correct page")
	public void it_should_show_correct_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Current URL is "+driver.getCurrentUrl());
	    
	}

}
