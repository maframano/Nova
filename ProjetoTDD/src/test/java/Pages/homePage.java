package Pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage extends BasePages {


	
	public homePage(WebDriver navegador) {
		super(navegador);
		// TODO Auto-generated constructor stub
	}

	public homePage confirmaNomeCadastradoAoladoDoUser() {
		
		
		//inspecionar se ao lado do user className("hi-user containMiniTitle ng-binding") tem o nome
		//cadastrado em xpath()
		WebElement me = navegador.findElement(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']"));
		String actual = me.getText();
		//span[@class='hi-user containMiniTitle ng-binding']
		assertEquals("benedito", actual);
		return this;
		
	}
	
}

