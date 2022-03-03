package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.fail;


public class EbayHome_steps {

    WebDriver driver = new Environment().getDriver();//am creat un nou obiect numit driver care este o instanta

    // a clasei Environment si prin intermediul careia se acceseaza metoda get.driver
    public EbayHome_steps() {}//aici am definit un constructor gol care este necesar in general pt crearea obiectuluoi
        //iar in cazul acesta specific este cerut de dependinta cu serenity


        @Given("I am on ebay homepage")
        public void i_am_on_ebay_homepage () {
            driver.get("https://www.ebay.com/");

        }
        @When("I click on advance link")
        public void i_click_on_advance_link () throws InterruptedException {
            driver.findElement(By.linkText("Advanced")).click();
            Thread.sleep(3000);
        }
        @Then("I navigate on the advance page")
        public void i_navigate_on_the_advance_page () {
            String expectedUrl="https://www.ebay.com/sch/ebayadvsearch";
            String actualUrl="https://www.ebay.com/sch/ebayadvsearch";

           assert expectedUrl.equals(actualUrl); // DACA IN LOC DE( == ) scri (.equals) nu mai da eroare
        /*
        System.out.println("expectedUrl is :"+ expectedUrl +"actualUrl is" + actualUrl);
        if(expectedUrl == actualUrl){
            System.out.println("Test has Passed");

        }
        else {
            fail("Acction that not navigate to expexted page");
        }

        */

        }
        @When("I search for {string}")
        public void i_search_for_iphone (String str1) throws Exception {
            driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str1);
            driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
            Thread.sleep(1000);
        }
        @Then("I have at least {int} search items returned")
        public void i_have_at_least_search_items_returned ( int count){
            String itemCount = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]")).getText().trim();
            String itemCount2 = itemCount.replace(",", "");
            int itemCountint = Integer.parseInt(itemCount2);
            if (!(itemCountint >= count)) {
                fail("Less than 1000 items");
            }
        }

    }

