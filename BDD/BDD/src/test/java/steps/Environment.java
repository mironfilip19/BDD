package steps;

import groovyjarjarantlr.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Environment{
    public static WebDriver driver;
    /*
    Exista 3 modificatori de acces:
    -public = variabila sau functia va putea fi accesata de oriunde
    -protected=variabile sau functia va putea fi accesata doar din acelasi pachet in care se afla clasa
    -private = variabila sau functia va putea fi accesata doar in clasa curenta

    Keywoard-ul static inseamna ca variabila sau functia poate sa fie accesata
                prin intermediul unei clase si nu este dependenta de instantioierea unui obiect


     */
    @Before  //tagul de before anunta sistemul ca urmatoarea metoda trebuie sa fie executata inainte de toate testele

    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @After //tagul de after anunta sistemul ca urmatoarea metoda  trebuie sa fie executata dupa toate testele
    public void  tearDown(){

       driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
