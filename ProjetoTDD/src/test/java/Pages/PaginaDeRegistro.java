package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;

public class PaginaDeRegistro extends BasePages {


	
	public PaginaDeRegistro(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	public homePage DadosCadastraisPage() {
		
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Preencer dados em Name ("usernameRegisterPage")
		
		navegador.findElement(By.name("usernameRegisterPage")).sendKeys("benedito");

		//preencher o email name("emailRegisterPage")
		navegador.findElement(By.name("emailRegisterPage")).sendKeys("beneditojose@hotmail.com");

		//inserir senha name ("passwordRegisterPage")
		navegador.findElement(By.name("passwordRegisterPage")).sendKeys("1Ben");

		//confirmar a senha ("confirm_passwordRegisterPage")
		navegador.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("1Ben");
		
		//Selecionar checkbox name("i_agree")
		navegador.findElement(By.name("i_agree")).click();
		
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Clicar em register id("register_btnundefined")
		
		navegador.switchTo().alert().accept();
		//navegador.findElement(By.id("register_btnundefined")).click();
		
		return new homePage (navegador);
	}	
	
public homePage DadosCadastraisPageNegativo() {
		
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Preencer dados em Name ("usernameRegisterPage")
		
		navegador.findElement(By.name("usernameRegisterPage")).sendKeys("benedito");

		//preencher o email name("emailRegisterPage")
		navegador.findElement(By.name("emailRegisterPage")).sendKeys("beneditojose@hotmail.com");

		//inserir senha name ("passwordRegisterPage")
		navegador.findElement(By.name("passwordRegisterPage")).sendKeys("1Ben");

		//confirmar a senha ("confirm_passwordRegisterPage")
		navegador.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("1Ben");
		
		//Selecionar checkbox name("i_agree")
		navegador.findElement(By.name("i_agree")).click();
		
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Clicar em register id("register_btnundefined")
		//navegador.findElement(By.id("register_btnundefined")).click();
		//elementToBeClickable(By.id("register_btnundefined"));
		navegador.switchTo().alert().accept();
		
		
		return new homePage (navegador);
	}	
	
}



