package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TMPuserlogin {
	WebDriver driver;
	
	@Given("user is on testmeapp Login page")
	public void user_is_on_testmeapp_Login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	driver = new ChromeDriver(); 
   	driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
   	driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() {
		driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("Lalitha");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click();
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
		String msg=driver.findElement(By.cssSelector("ul.nav")).getText();
	    String msg2="Hi, Lalitha";
	   Assert.assertTrue(msg.contains(msg2));
	    driver.findElement(By.linkText("SignOut")).click();
	}

	@Given("testmeapp login page")
	public void testmeapp_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}

	@When("user provides the incorrect credentials")
	public void user_provides_the_incorrect_credentials() {
		driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("Lalitttha");
	    driver.findElement(By.name("password")).sendKeys("password");
	    driver.findElement(By.name("Login")).click();
	}

	@Then("user gets an error message")
	public void user_gets_an_error_message() {
		System.out.println("Invalid Username and Password");
	}

	@Given("login page is open")
	public void login_page_is_open() {
		System.setProperty("webdriver.chrome.driver","C:\\Ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
	}

	@When("user provided no credentials")
	public void user_provided_no_credentials() {
		driver.navigate().to("https://10.232.237.143/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("Login")).click();
	}

	@Then("user gets blank error message")
	public void user_gets_blank_error_message() {
		System.out.println("Invalid Username and Password");
	}
}
