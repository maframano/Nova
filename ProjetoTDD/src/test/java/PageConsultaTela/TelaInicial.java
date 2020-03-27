package PageConsultaTela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;
import PageConsultaPorFiltro.TabletsPage;

public class TelaInicial extends BasePages{

	public TelaInicial(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}
	
	public LaptopPage selecionaProduto(){
		
		navegador.findElement(By.id("laptopsImg")).click();
		
		return new LaptopPage(navegador);
	}

}

//return  new TabletsPage(navegador);