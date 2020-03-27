package PageConsultaTela;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Negocio.BasePages;

public class ProdutoPage extends BasePages{

	public ProdutoPage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	
	public ProdutoPage  HpZBookPage() {
		
		WebElement me = navegador.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
        String actual = me.getText();
        String euQuero = "HP ZBOOK 17 G2 MOBILE WORKSTATION";
        assertEquals(euQuero, actual);
		
		return this;
		
		
	}
}

//HP ZBOOK 17 G2 MOBILE WORKSTATION