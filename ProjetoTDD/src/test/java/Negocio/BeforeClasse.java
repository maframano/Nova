package Negocio;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BeforeClasse {

	 public static void openBrowser(){
		 		 
		 String driverExecutablePath = "C:\\Users\\mafra.romao\\eclipse-workspace\\nova\\ProjetoTDD\\src\\test\\resources\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		 
		 WebDriver driver = new ChromeDriver();
         driver.get("https://advantageonlineshopping.com/#/");
 } 
}




