package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
	private WebDriver navegador;
	
	public LoginPages(WebDriver navegador) {
		this.navegador = navegador;
		
	}
		
	public PaginaDeRegistro LoginCadastroPage() {
	
	//clicar em user id("menuUserSVGPath")
	
	navegador.findElement(By.id("menuUserSVGPath")).click();
	
	//clicar em className("create-new-account ng-scope")
	
	 navegador.findElement(By.className("create-new-account ng-scope")).click();
	
	
	return new PaginaDeRegistro(navegador);

	
	}
}
