package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;
import org.testng.Assert;
import Base.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


 
public class TC001 extends browser {
	public static WebDriver driver;
	@Given("launch the {string} website")
	public void launch_the_website(String browser) {
		
		//openBrowser("chrome");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}

	@When("open the website")
	public void launch_the_website() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	   
	}

	@Then("user login with valid username {string} password {string}")
	public void user_login_with_valid_username_password(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("Verfy the Home Page")
	public void verfy_the_home_page() {
		String dashboard=driver.findElement(By.xpath("//span[text()='Dashboard']")).getText(); 
		System.out.println(dashboard);
		Assert.assertEquals(dashboard, "Dashboard");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}


}
