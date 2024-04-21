package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebooksteps {
    WebDriver driver;
    @Given("Launch chrome browser")
    public void launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soyeb\\Seleniumwithcucumber\\driver\\msedgedriver.exe");
        driver=new EdgeDriver();


    }
    @When("open the url")
    public void open_the_url() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        // Write code here that turns the phrase above into concrete actions

    }
    @Then("verify that the logo present on the page")
    public void verify_that_the_logo_present_on_the_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);
     boolean status=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
     Assert.assertEquals(true,status);

    }
    @Then("close the browser")
    //Then andAnd is similar
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }




}
