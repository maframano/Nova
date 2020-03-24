package PageLoggin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;
import Pages.PaginaDeRegistro;

public class LoginCadastradoPage extends BasePages {

	public LoginCadastradoPage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	
	public PaginaDeLogin LoginPage() {
		navegador.findElement(By.id("menuUserSVGPath")).click();
		
		navegador.findElement(By.className("ng-valid ng-scope ng-touched ng-dirty ng-valid-parse")).sendKeys("MafraMano");
		navegador.findElement(By.name("password")).sendKeys("4Jes");
		
	}

}
