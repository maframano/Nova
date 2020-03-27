package PageConsultaPorFiltro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Negocio.BasePages;

public class ErroPage extends BasePages {

	public ErroPage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	
	public ErroPage confirmaMensagemErro() {
		
		WebElement me = navegador.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span"));
		String actual = me.getText();
		String euQuero = "No results for \"banana\"";
		assertEquals(euQuero, actual);
		
		return this;
	}

}
