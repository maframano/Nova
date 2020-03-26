package PageLoggin;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Negocio.BasePages;
import io.netty.util.Timeout;

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
	
	public PaginaDeLogin preencheDadosUsuarioNegativo() throws InterruptedException{ 

	navegador.findElement(By.name("username")).sendKeys("benedito");
	navegador.findElement(By.name("password")).sendKeys("4Jfkdhfkhs");
	
	navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//clicar no botão SIGN IN sob o id("sign_in_btnundefined")
	
	navegador.findElement(By.id("sign_in_btnundefined")).click();

	// FluentWait wait = new FluentWait(navegador);
	// wait.withTimeout(5000, TimeUnit.MILLISECONDS);
	// wait.pollingEvery(250, TimeUnit.MILLISECONDS);
	// wait.ignoring(NoSuchElementException.class);
	// wait.until(ExpectedConditions.alertIsPresent());
	
	//Thread.sleep(500);
	//Verificar mensagem de erro no top
	WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
	WebElement me = navegador.findElement(By.id("signInResultMessage"));
	//wait.until(ExpectedConditions.textToBePresentInElement(validacao, "Incorrect user name or password."));
	aguardar.until(ExpectedConditions.textToBePresentInElement(me, "Incorrect user name or password."));

		String actual = me.getText();
		assertEquals("Incorrect user name or password.", actual);
	
	return this;
	
	}
}

//elementToBeClickable

//wait.until(ExpectedConditions.textToBePresentInElement(validacao, "Incorrect user name or password."));
//assertEquals("User is temporary blocked from login", actual);
