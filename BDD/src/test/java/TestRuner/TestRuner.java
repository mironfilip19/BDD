package TestRuner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"features"},         //aici am definit numele dosarului in care sistemul va gasi fisierele de features

  glue ={"steps"},              //DACA NU PUI Ebay_home_steps in folderul Steps (definit la glue) nu va vedea  pasi
                               // aici am definit numele dosarului in care sistemul va gasi fisierele de staps definite

  plugin ={"pretty","html:reports/execution_reports.html"
  },              //aici am def tipul raportului care se va genera la executie(html),
                 // folderul in care se va gasi raportul(raports) si numele raportului (execution_reports.html)
                //plugin ={"pretty","json:reports/execution_reports.html"} - se poate genera raportul si in format json
               //plugin ={"pretty","junit:reports/execution_reports.html"} - se poate genera raportul si in format junit

   dryRun = false,            //daca instructiunea este setata pe true atunci nu se va executa coduldefinit in
                             // fisierele de steps si se va verifica daca fiecare fisier din folderul de features
                            // are un corespondent in folderul de staps

   monochrome = true     //daca optiunea este setata pe true se vor elimina rezultate redundante din consola daca
                          // avem setat si fisierul [cucumber.properties]

   //tags = "@T1"        //optiunea tags filtreaza testele pe care vrem sa le rulam pe baza de taguri (etichete)
//,name = "Search"    //optiunea de name filtreaza testele pe care vrem sa le rulam pe baza de nume
   )


public class TestRuner {


}
