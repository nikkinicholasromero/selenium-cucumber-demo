package demo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class StepDefinition {
    private WebDriver driver;

    @Before
    public void test() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @And("^I go to '(.*)'$")
    public void I_go_to(String url) {
        driver.get(url);
    }

    @And("^I click order now$")
    public void I_click_order_now() {
        driver.findElement(By.xpath("//*[contains(text(), 'Order Now')]")).click();
    }

    @Then("^I should be redirected to '(.*)'$")
    public void I_should_be_redirected_to(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }
}
