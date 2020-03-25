package PageLoggin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;

public class PaginaDeLogin extends BasePages{

	public PaginaDeLogin(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	
	public LoginHomePage preencheDadosUsuario(){ 

	navegador.findElement(By.xpath("/html[1]/body[1]/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[1]/div[1]/input[1]")).sendKeys("MafraMano");
	navegador.findElement(By.xpath("/html[1]/body[1]/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[2]/div[1]/input[1]")).sendKeys("4Jes");
	
	navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	
	//clicar no botão SIGN IN sob o id("sign_in_btnundefined")
	
	navegador.findElement(By.id("sign_in_btnundefined")).click();
	
	return new LoginHomePage(navegador);
	
	}
}


