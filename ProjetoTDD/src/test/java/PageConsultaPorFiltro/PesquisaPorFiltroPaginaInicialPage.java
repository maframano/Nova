package PageConsultaPorFiltro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;
//import PageLoggin.LoginHomePage;

public class PesquisaPorFiltroPaginaInicialPage extends BasePages{

	public PesquisaPorFiltroPaginaInicialPage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	public TabletsPage pesquisaDeProduto() {
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		navegador.findElement(By.id("menuSearch")).click();
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		navegador.findElement(By.id("autoComplete")).sendKeys("tablet");
		
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		navegador.findElement(By.id("autoComplete")).click();
		
		
		return  new TabletsPage(navegador);
		
	
	}
	
public ErroPage pesquisaDeProdutoNegativo(){
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		navegador.findElement(By.id("menuSearch")).click();
		
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		navegador.findElement(By.id("autoComplete")).sendKeys("banana");
		
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		navegador.findElement(By.id("autoComplete")).click();
		
		
		return  new ErroPage(navegador);
		
	
	}
	
}
//return new LoginHomePage(navegador);