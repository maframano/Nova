package PageConsultaTela;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
	
public  TelaInicial selecionaProdutoNegativo(){
	
	//WebElement me = navegador.findElement(By.id("banana"));
			
	//boolean compara = me.getSize() > 0;

	Boolean compara = navegador.findElements(By.id("banana")).size() > 0;
	Assert.assertFalse(compara);
   
	return this;
  }


}

