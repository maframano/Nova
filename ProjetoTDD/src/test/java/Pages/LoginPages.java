package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;

import Negocio.BasePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPages extends BasePages{
	
		
	public LoginPages(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	public PaginaDeRegistro LoginCadastroPage() {
			
	//clicar em user id("menuUserSVGPath")
	
	navegador.findElement(By.id("menuUserSVGPath")).click();
	
	//clicar no botão create acount em linkText("CREATE NEW ACCOUNT"
		
	navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 JavascriptExecutor js = (JavascriptExecutor) navegador;
     js.executeScript("arguments[0].click();", Cadastro(navegador));

	 
	return new PaginaDeRegistro(navegador);

	
	}
	
	public WebElement Cadastro(WebDriver driver) {

       WebElement botaoCriaNovaConta = navegador.findElement(By.linkText("CREATE NEW ACCOUNT"));

        return botaoCriaNovaConta;
	}
}
