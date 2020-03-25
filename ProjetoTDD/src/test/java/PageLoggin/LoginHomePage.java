package PageLoggin;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Negocio.BasePages;
import Pages.homePage;

public class LoginHomePage extends BasePages{

	public LoginHomePage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	
public LoginHomePage confirmaNomeCadastradoAoladoDoUser() {
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//inspecionar se ao lado do user className("hi-user containMiniTitle ng-binding") tem o nome
		//cadastrado em xpath()
		WebElement me = navegador.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String actual = me.getText();
		//span[@class='hi-user containMiniTitle ng-binding']
		assertEquals("MafraMano", actual);
		
		return this;
		
	}
	
	

}
