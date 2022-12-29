package by.itacademy.cucumber.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageStep {
    WebDriver driver;
    String url = "https://www.google.com/";
    String xPathInputField = "//input[@name='q']";
    String xPathButton = "//div[@class='FPdoLc lJ9FBc']/center/input[1]";
    String xPathJava = "//h3[@class='LC20lb MBeuO DKV0Md']";

    public PageStep() {
    }

    @Given("Google page open")
    public void openPage() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("Cookie close")
    public void inputWord() {
        By byInputField = By.xpath(xPathInputField);
        WebElement elementInputField = driver.findElement(byInputField);
        elementInputField.sendKeys("Java");
    }

    @When("Input word Java")
    public void clickButton() {
        By byButton = By.xpath(xPathButton);
        WebElement elementButton = driver.findElement(byButton);
        elementButton.click();
    }

    @Then("Java exists")
    public void javaExists() {
        By nameJava = By.xpath(xPathJava);
        WebElement webElement = driver.findElement(nameJava);
        String actual = webElement.getText();

        Assert.assertTrue(actual.contains("Selenium"));
    }
}
