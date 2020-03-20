package br.com.ProjectTDD.pages;
import static org.junit.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import Negocio.BeforeClasse;

public class Principal {

	 private static ChromeDriver driver;
	 WebElement element;
	public static BeforeClasse abreNavegador;
		
		@BeforeClass
		public static void openBrowser() {
		abreNavegador = new BeforeClasse();
	    abreNavegador.openBrowser();
		 
		}
		
		@Test
		
		public void pesquisaPagina() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("speakersImg")).click();
			
			String paginaEsperada = driver.findElement(By.xpath("//h3[@class='categoryTitle roboto-regular sticky ng-binding']")).getText();
			String paginaEncontrada = driver.findElement(By.tagName("h3")).getText();
			assertEquals(paginaEsperada, paginaEncontrada);
			
			//WebElement speakersImg = driver.findElement(By.id("speakersImg"));
		//speakersImg.click();
		}
		
		// @After
		  //  public void after() {
		    //  driver.quit();
		    //}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
