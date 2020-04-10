package Negocio;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BeforeClasse {

	 public static WebDriver openBrowser(){
		//Abre o navegador
		  
		 String driverExecutablePath = "/ProjetoTDD/src/test/resources/chromedriver.exe";
		 
		 //C:\Users\Mafra\eclipse-workspace\Nova\ProjetoTDD\src\test\resources
		 System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		 //achando a pagina que se quer testar
		 WebDriver navegador = new ChromeDriver();
         //navegador.get("https://advantageonlineshopping.com/#/");
         navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         navegador.manage().window().maximize();   
         navegador.get("https://www.advantageonlineshopping.com/#/");
         return navegador;
 } 
}




