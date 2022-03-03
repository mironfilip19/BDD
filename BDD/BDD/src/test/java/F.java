import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://filip22-trials73.orangehrmlive.com/client/#/dashboard");
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword")).sendKeys("AW4@nJgO0r");
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/form/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[5]/ul/li[8]/a/span[2]")).click();
        driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();

        driver.switchTo().frame("noncoreIframe");
        driver.findElement(By.id("list_item_add")).click();

        driver.findElement(By.id("addCase_employeeName_empName")).
                sendKeys("ka");

        WebElement Autocomplet1 = driver.findElement(By.id("addCase_employeeName_empName"));
        Actions action = new Actions(driver); // Se creaza un obiect al clasei Actions
        action.moveToElement(Autocomplet1).perform(); // Se face hover pe Dresses
        WebElement Autocomplet2 = driver.findElement(By.xpath("/html/body/div[10]/ul/li"));
        Autocomplet2.click();

        driver.findElement(By.id("addCase_caseName")).sendKeys("TEST2");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(4000);


        driver.findElement(By.xpath
                ("/html/body/div[1]/div[2]/section/div/div[4]/div[3]/a[5]")).click();

        driver.quit();

    }
}


//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://filip22-trials73.orangehrmlive.com/client/#/dashboard");
//        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.name("txtPassword")).sendKeys("AW4@nJgO0r");
//        Thread.sleep(1000);
//        System.out.println("First Click");
//        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/form/div[3]/button")).click();
//        Thread.sleep(1000);
//        System.out.println("Second Click");
//        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/div/div[5]/ul/li[8]/a/span[2]")).click();
//        Thread.sleep(1000);
//        System.out.println("Third Click");
//        driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();
//        driver.manage().window().maximize();
//        Thread.sleep(6000);
//        driver.switchTo().frame("noncoreIframe");
//        driver.findElement(By.id("list_item_add")).click();
//
//    }
//}
//       // driver.findElement(By.id("addItemBtn")).click();
//
//
//        Thread.sleep(2000);
//
//
//
////        driver.get("https://www.openstreetmap.org/");
////        Thread.sleep(2000);
////        WebElement search = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
////        search.click();
////        search.sendKeys("Bucuresti");
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[2]/input")).click();
////        Thread.sleep(2000);
////        System.out.println("The test has passed");
////        driver.quit();
//    }
//}
//// SINGUR TEST  IN JAVA
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class CasualDress {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();        WebDriver driver = new ChromeDriver();
//        driver.get("http://automationpractice.com/index.php");
//        WebElement Dresses = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]"));
//        Actions action = new Actions(driver); // Se creaza un obiect al clasei Actions
//        Thread.sleep(6000);
//        action.moveToElement(Dresses).perform(); // Se face hover pe Dresses
//        WebElement CasualDresses = driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li"));
//        CasualDresses.click();
//        Thread.sleep(3000);
//
//    }
//}