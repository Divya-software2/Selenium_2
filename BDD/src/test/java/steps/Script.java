package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script {

	WebDriver d1;
@Given("Open chrome browser and url of the application")
public void open_chrome_browser_and_url_of_the_application() {
	System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	d1=new ChromeDriver();
	d1.get("https://ksrtc.in/oprs-web/login/show.do");
	d1.manage().window().maximize();
	System.out.println("Given done");
}

@When("Enter Username , password and click on login button")
public void enter_Username_password_and_click_on_login_button() {
	d1.findElement(By.id("userName")).sendKeys("DivyaJK");
	d1.findElement(By.id("password")).sendKeys("surya@123");
	d1.findElement(By.id("submitBtn")).click();
	d1.close();
	System.out.println("When done");
}

@Then("Success in login")
public void success_in_login() {
	System.out.println("Then done");
}

@Given("Open chrome browser and url of the application1")
public void open_chrome_browser_and_url_of_the_application1() {
	System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	d1=new ChromeDriver();
	d1.get("https://ksrtc.in/oprs-web/user/add.do");
	d1.manage().window().maximize();
	System.out.println("Given done");
}

@When("Enter Email , fullname , mobilenumber and click on add button")
public void enter_Email_fullname_mobilenumber_and_click_on_add_button() {
	d1.findElement(By.id("email")).sendKeys("Divyamass@123");
	d1.findElement(By.id("fullName")).sendKeys("DivyaJaline");
	d1.findElement(By.id("mobileNo")).sendKeys("9080600100");
	d1.findElement(By.name("SaveBtn")).click();
	d1.close();
	System.out.println("When done");
}

@Then("Success in add")
public void success_in_add() {
	System.out.println("Then done");
}

@Given("Open chrome browser and url of the application2")
public void open_chrome_browser_and_url_of_the_application2() {
	System.setProperty("webdriver.chrome.driver","d:\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	d1=new ChromeDriver();
	d1.get("https://ksrtc.in/oprs-web/");
	d1.manage().window().maximize();
	System.out.println("Given done");
}

@When("Enter From , to , departure , return1 and click on search button")
public void enter_From_to_departure_return1_and_click_on_search_button() throws InterruptedException {
	d1.findElement(By.id("fromPlaceName")).sendKeys("beng");
	Thread.sleep(1500);
	List<WebElement> list1 = d1.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	for(WebElement ele1:list1) {
	if(ele1.getText().equalsIgnoreCase("BENGALURU")){
	ele1.click();
	break;
	}
	}
	d1.findElement(By.id("toPlaceName")).sendKeys("hyd");
	Thread.sleep(1500);
	List<WebElement> list2 =d1.findElements(By.xpath("//*[@id=\"ui-id-2\"]/li"));
	for(WebElement ele2:list2) {
	if(ele2.getText().equalsIgnoreCase("HYDERABAD")){
	ele2.click();
	break;
	}
	}
	JavascriptExecutor jse1=(JavascriptExecutor) d1;
	jse1.executeScript("document.getElementById('txtJourneyDate').value='17/01/2022'");
	JavascriptExecutor jse2=(JavascriptExecutor) d1;
	jse2.executeScript("document.getElementById('txtReturnJourneyDate').value='23/01/2022'");
	d1.findElement(By.xpath("/html/body/main/form/div[1]/div/div[2]/div[3]/button")).click();
	JavascriptExecutor jse3=(JavascriptExecutor) d1;
	jse3.executeScript("scroll(0,550)");
	System.out.println("When done");
}

@Then("Success in search")
public void success_in_search() {
	System.out.println("Then done");
}
}
