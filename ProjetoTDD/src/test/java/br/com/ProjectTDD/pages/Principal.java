package br.com.ProjectTDD.pages;
//import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Negocio.BeforeClasse;
import PageConsultaPorFiltro.PesquisaPorFiltroPaginaInicialPage;
import PageConsultaPorFiltro.TabletsPage;
import PageLoggin.LoginCadastradoPage;
import Pages.LoginPages;

public class Principal {

	private WebDriver navegador;
	
		
		@BeforeMethod
		
		public void openBrowser() {
		//abreNavegador = new BeforeClasse();
	    //BeforeClasse.openBrowser();
			navegador = BeforeClasse.openBrowser();
		}
		
		//@Test
		public void CadastroDeUsuario() {
			new LoginPages(navegador) 
				.LoginCadastroPage()
				.DadosCadastraisPage()
				.confirmaNomeCadastradoAoladoDoUser();
			
		}
		
		//@Test
		public void CadastroDeUsuarioNegativo(){
			new LoginPages(navegador)
				.LoginCadastroPage()				
				.DadosCadastraisPageNegativo();
				
		}
		
		//@Test
		public void LoginusuarioJaCadastrado(){
			
			new LoginCadastradoPage(navegador) 
				.LoginPage()
				.preencheDadosUsuario()
				.confirmaNomeCadastradoAoladoDoUser();
		}
		
		//@Test
		
		public void LoginusuarioJaCadastradoNegativo() throws InterruptedException{
			new LoginCadastradoPage(navegador) 
			.LoginPage()
			.preencheDadosUsuarioNegativo();
			
		}
		
		@Test
		public void ConsultaPorFiltro() {
			new PesquisaPorFiltroPaginaInicialPage(navegador)
				.pesquisaDeProduto()
				.pesquisaTablet()
				.ConfirmaBusca();
			
		}
		
		//@Test
		public void ConsultaPorFiltroNegativo() {
				new PesquisaPorFiltroPaginaInicialPage(navegador)
					.pesquisaDeProdutoNegativo()
					.confirmaMensagemErro();
			
		}
		
	    @AfterMethod
		   public void fechaNavegador() {
		      navegador.quit();
		    }

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
