package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages extends BasePages{
	
		
	public LoginPages(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	public PaginaDeRegistro LoginCadastroPage() {
		
	
	
	//clicar em user id("menuUserSVGPath")
	
	navegador.findElement(By.id("menuUserSVGPath")).click();
	
	//clicar em className("create-new-account ng-scope")
	
	 //navegador.findElement(By.className("create-new-account ng-scope")).click();
	
	
	
	navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//WebDriverWait espera =  new  WebDriverWait (navegador, 10 );
	
	 WebElement criaConta = navegador.findElement(By.linkText("CREATE NEW ACCOUNT"));
	 criaConta.click();
	 
	return new PaginaDeRegistro(navegador);

	
	}
}
