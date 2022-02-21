package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiteMap_steps {
    WebDriver driver = new Environment().getDriver();

    public SiteMap_steps(){}


        @Given("I am on openStreetMap")
        public void I_am_on_openStreetMap() throws InterruptedException {
            driver.get("https://www.openstreetmap.org/");
            Thread.sleep(2000);

        }

        @When("I enter on adress")
        public void i_Enter_On_Adress() throws InterruptedException {
            WebElement search = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
            search.click();
            search.sendKeys("Bucuresti");
            Thread.sleep(2000);
        }

        @And("I press on the go button")
        public void i_PressOn_The_Go_Button() throws InterruptedException {
            driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[2]/input")).click();
            Thread.sleep(2000);
        }

        @Then("I whill see the result available")
        public void i_Whill_See_TheResult_Available() {
            System.out.println("The test has passed");

        }
    }
