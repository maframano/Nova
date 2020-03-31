package PageLoggin;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Negocio.BasePages;
import testData.ExtraiDadoExcel;


public class PaginaDeLogin extends BasePages{

	public PaginaDeLogin(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	
	private ExtraiDadoExcel dadosname = new ExtraiDadoExcel();
	

	public LoginHomePage preencheDadosUsuario() throws Exception{ 

	
		navegador.findElement(By.name("username")).sendKeys(dadosname.getUserName());
		
	navegador.findElement(By.name("password")).sendKeys(dadosname.getPassWord());
	
	navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	//clicar no botão SIGN IN sob o id("sign_in_btnundefined") sign_in_btnundefined
	
	navegador.findElement(By.id("sign_in_btnundefined")).click();
	
	return new LoginHomePage(navegador);
	
	}
	
	public PaginaDeLogin preencheDadosUsuarioNegativo() throws InterruptedException{ 

	navegador.findElement(By.name("username")).sendKeys("benedito");
	navegador.findElement(By.name("password")).sendKeys("4Jfkdhfkhs");
	
	navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//clicar no botão SIGN IN sob o id("sign_in_btnundefined")
	
	navegador.findElement(By.id("sign_in_btnundefined")).click();

	//Verificar mensagem de erro no topo
	WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
	WebElement me = navegador.findElement(By.id("signInResultMessage"));
	aguardar.until(ExpectedConditions.textToBePresentInElement(me, "Incorrect user name or password."));

		String actual = me.getText();
		assertEquals("Incorrect user name or password.", actual);
	
	return this;
	
	}
}


