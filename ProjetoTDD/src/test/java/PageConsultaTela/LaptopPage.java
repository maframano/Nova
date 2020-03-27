package PageConsultaTela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;

public class LaptopPage extends BasePages {

	public LaptopPage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	

	public ProdutoPage escolherNotePage() {
		 navegador.findElement(By.xpath("/html[1]/body[1]/div[3]/section[1]/article[1]/div[3]/div[1]/div[1]/div[2]/ul[1]/li[11]/img[1]")).click();
		
		return new ProdutoPage(navegador);
		
		
	}

}
