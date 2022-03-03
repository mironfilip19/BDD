package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class OrangeHRM_steps {
    WebDriver driver = new Environment().getDriver();
    public OrangeHRM_steps(){}

    @Given("I am on OrangeHRM homepage")
    public void i_am_on_ebay_homepage () throws InterruptedException {
        driver.get("https://filip22-trials73.orangehrmlive.com/client/#/dashboard");
        Thread.sleep(3000);
    }

    @When("I click on username and complete {string}")
        public void I_click_on_username_and_complete_admin (String query){
        //driver.findElement(By.name("txtUsername")).sendKeys("Admin");

        WebElement element = driver.findElement(By.name("txtUsername"));
        element.sendKeys(query);


    }
    @And("I click on password and complete {string}")
    public void I_click_on_password_and_complete_admin (String query){

     //driver.findElement(By.name("txtPassword")).sendKeys("AW4@nJgO0r");
       WebElement element = driver.findElement(By.name("txtPassword"));
        element.sendKeys(query);
        element.submit();

   }
    @When("Go to Discipline")
    public void Go_to_Discipline () throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[5]/ul/li[8]/a/span[2]")).click();

    }
    @And("Go to DisciplinaryCases")
        public void Go_to_DisciplinaryCases() throws InterruptedException {

       driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();
        Thread.sleep(6000);
    }
    @Then("Go to Add DisciplinaryCases")
        public void Go_to_Add_DisciplinaryCases() throws InterruptedException {

        driver.switchTo().frame("noncoreIframe");
        driver.findElement(By.id("list_item_add")).click();
    }

    @And("Add Disciplinary Case Save And Exit")
        public void Add_Disciplinary_Case_Save_And_Exit() throws InterruptedException {
        driver.findElement(By.id("addCase_employeeName_empName")).
                sendKeys("le");

        WebElement Autocomplet1 = driver.findElement(By.id("addCase_employeeName_empName"));
        Actions action = new Actions(driver); // Se creaza un obiect al clasei Actions
        action.moveToElement(Autocomplet1).perform(); // Se face hover pe Autocomplet1
        WebElement Autocomplet2 = driver.findElement(By.xpath("/html/body/div[10]/ul/li"));
        Autocomplet2.click();

        driver.findElement(By.id("addCase_caseName")).sendKeys("Test1");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath
                                ("/html/body/div[1]/div[2]/section/div/div[4]/div[3]/a[5]")).click();
        Thread.sleep(9000);
    }
}
