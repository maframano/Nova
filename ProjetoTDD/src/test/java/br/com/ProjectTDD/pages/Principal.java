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
import Pages.LoginPages;

public class Principal {

	private WebDriver navegador;
	
		
		@Before
		
		public void openBrowser() {
		//abreNavegador = new BeforeClasse();
	    //BeforeClasse.openBrowser();
			navegador = BeforeClasse.openBrowser();
		}
		
		@Test
		public void CadastroDeUsuario() {
			new LoginPages(navegador) 
				.LoginCadastroPage()
				.DadosCadastraisPage()
				.confirmaNomeCadastradoAoladoDoUser();
				
				
			
			
		}
		
		//@Test
		public void TestePesquisaPagina(){
		
			//clicar na categoria SPEAKERS
			
			//clicar no produto HP ROAR MINI WIRELESS SPEAKER
			
			//comparar se o produto esperado é o produto realmente encontrado
	
			//assertEquals("Resultado esperado: ", 1, 1);
		}
		
		//@After
		  // public void fechaNavegador() {
		    //  navegador.quit();
		   // }

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
