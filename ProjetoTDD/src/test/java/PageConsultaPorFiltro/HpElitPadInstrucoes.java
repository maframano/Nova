package PageConsultaPorFiltro;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Negocio.BasePages;

public class HpElitPadInstrucoes extends BasePages{

	public HpElitPadInstrucoes(WebDriver navegador) {
		super(navegador);
		
		
		// TODO Auto-generated constructor stub
	}
	
	public HpElitPadInstrucoes ConfirmaBusca(){
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement me = navegador.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']"));
		
		String actual = me.getText();
		//Compara se o nome do produto esperado
		assertEquals("HP ELITEPAD 1000 G2 TABLET", actual);
		
		
		return this;
	}
	
	

}
