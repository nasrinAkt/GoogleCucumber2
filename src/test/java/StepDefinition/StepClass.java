package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	@Given("^open google application$")
	public void open_google_application() throws Throwable {
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe") ;
		 ChromeOptions run = new ChromeOptions();
		 run.addArguments("--remote-allow-origins=*");
		                                                                                                           
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		
		
		
		
	}
	
	@Then("^search for New Jersey$")
	public void search_for_New_Jersey() throws Throwable {
		WebElement run = driver.findElement(By.id("APjFqb"));
		run.sendKeys("New Jersey");
		
		WebElement run1 = driver.findElement(By.id("APjFqb"));
		run1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}


	@Then("^search for New York$")
	public void search_for_New_York() throws Throwable {
	  
		 WebElement run = driver.findElement(By.name("q"));
		   run.sendKeys("New York");
		   WebElement run1 = driver.findElement(By.name("q"));
		  run1.sendKeys(Keys.ENTER);
		  
		   Thread.sleep(2000);
	/*	List<WebElement> ele  = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(ele.size());
		ele.get(ele.size()-3).click();
		Thread.sleep(2000);
		driver.close();   */	
		
		
	}

	@Then("^click new york city$")
	public void click_new_york_city() throws Throwable {
		 WebElement run3 = driver.findElement(By.xpath("//h3[text()='New York City']"));
		    run3.click();
		    Thread.sleep(2000);
		    driver.close();
		
		
		
		
		
	}


}
