package PageConsultaPorFiltro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Negocio.BasePages;

public class TabletsPage extends BasePages {

	public TabletsPage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	public HpElitPadInstrucoes pesquisaTablet(){
		
		navegador.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		navegador.findElement(By.xpath("//div[@class='cell categoryRight']//li[1]")).click();
		
		//navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navegador.findElement(By.xpath("//div[@class='cell categoryRight']//li[1]")).click();
		
		return new HpElitPadInstrucoes(navegador);
		
		
	}
	
	

}
//hpElitePad