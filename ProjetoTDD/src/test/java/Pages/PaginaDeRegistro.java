package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaDeRegistro  {

private WebDriver navegador;
	
	public PaginaDeRegistro(WebDriver navegador) {
		this.navegador = navegador;
		
	}
	
	public homePage DadosCadastraisPage() {

		//Preencer dados em Name ("usernameRegisterPage")
		
		navegador.findElement(By.name("usernameRegisterPage")).sendKeys("benedito");

		//preencher o email name("emailRegisterPage")
		navegador.findElement(By.name("emailRegisterPage")).sendKeys("beneditojose@hotmail.com");

		//inserir senha name ("passwordRegisterPage")
		navegador.findElement(By.name("passwordRegisterPage")).sendKeys("1Ben");

		//confirmar a senha ("confirm_passwordRegisterPage")
		navegador.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("1Ben");
		
		//Selecionar checkbox name("i_agree")
		navegador.findElement(By.name("confirm_passwordRegisterPage")).click();

		//Clicar em regigter id("register_btnundefined")
		navegador.findElement(By.id("register_btnundefined")).click();
		
		return new homePage (navegador);
	}	
	
	
}



