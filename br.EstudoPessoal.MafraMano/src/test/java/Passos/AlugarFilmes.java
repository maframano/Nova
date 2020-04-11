package Passos;

import Entidades.Filme;
import Serviços.AluguelService;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AlugarFilmes {
	private Filme filme;
	private AluguelService aluguel;
	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
	   filme = new Filme();
	   filme.setEstoque(arg1);
	}

	@Dado("^que o preco do alugue seja R\\$ (\\d+)$")
	public void queOPrecoDoAlugueSejaR$(int arg1) throws Throwable {
	   filme.setAluguel(arg1);
	   
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
	   aluguel.alugar(filme);
	}

	@Então("^o preço do alugue será R\\$(\\d+)$")
	public void oPreçoDoAlugueSeráR$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^a data de entrega será no dia seguinte$")
	public void aDataDeEntregaSeráNoDiaSeguinte() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^o estoque do filme sera (\\d+) unidade$")
	public void oEstoqueDoFilmeSeraUnidade(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
