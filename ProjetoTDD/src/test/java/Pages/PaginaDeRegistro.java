package Pages;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import Negocio.BasePages;

public class PaginaDeRegistro extends BasePages {


	
	public PaginaDeRegistro(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
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
		navegador.findElement(By.name("first_nameRegisterPage")).sendKeys("benedito");
		navegador.findElement(By.name("last_nameRegisterPage")).sendKeys("Jose");
		navegador.findElement(By.name("phone_numberRegisterPage")).sendKeys("131111111111");

		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select combobox = new Select(navegador.findElement(By.name("countryListboxRegisterPage")));
			
		//navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		combobox.selectByVisibleText("Brazil");

		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		navegador.findElement(By.name("cityRegisterPage")).sendKeys("Sao Vicente");
		
		JavascriptExecutor desceRua = (JavascriptExecutor)navegador;
		desceRua.executeScript("window.scrollBy(0,200)");
		
		navegador.findElement(By.name("addressRegisterPage")).sendKeys("Rua Benigno, N 040");
		navegador.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("SP");
		navegador.findElement(By.name("postal_codeRegisterPage")).sendKeys("11349440");

		//Selecionar checkbox name("i_agree")
		navegador.findElement(By.name("i_agree")).click();

		//Clicar em register id("register_btnundefined")		
		navegador.findElement(By.id("register_btnundefined")).click();
		
		return new homePage (navegador);
	}	
	
	
public PaginaDeRegistro DadosCadastraisPageNegativo() {

	
	navegador.findElement(By.name("usernameRegisterPage")).sendKeys("daniel");
	navegador.findElement(By.name("emailRegisterPage")).sendKeys("daniel@hot");
	navegador.findElement(By.name("passwordRegisterPage")).sendKeys("1Dan");
	navegador.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("1Dan");
	

	//Selecionar checkbox name("i_agree")
	navegador.findElement(By.name("i_agree")).click();

	//Verificar mensagem de erro no campo email
	WebElement me = navegador.findElement(By.xpath("//label[@class='animated invalid']"));
	String actual = me.getText();
	assertEquals("Your email address isn't formatted correctly", actual);
	return this;
	
	}	

	
	
}


