package com.br.sergio.cucumber.steps;

import com.br.sergio.cucumber.entidades.AlugarFilmeService;
import com.br.sergio.cucumber.entidades.Filme;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AlugarFimes {
	
	private Filme filme;
	AlugarFilmeService alugarFilmeService;

	@Dado("^um filme com estoque (\\d+)$")
	public void umFilmeComEstoque(int arg1) {
		
		filme = new Filme();
		filme.setEstoque(arg1);

	}

	@Dado("^que o preco do aluguel é R\\$ (\\d+)$")
	public void queOPrecoDoAluguelÉR$(int arg1) {
		
		filme.setPreco(arg1);

	}

	@Quando("^alugar$")
	public void alugar() {
		alugarFilmeService = new AlugarFilmeService();
		alugarFilmeService.aluga(filme);

	}

	@Entao("^o valor do alguel será R\\$ (\\d+)$")
	public void oValorDoAlguelSeráR$(int arg1) {
		
	}

	@Entao("^a data de entrega será no dia seguinte$")
	public void aDataDeEntregaSeráNoDiaSeguinte() {

	}

	@Entao("^o estoque será (\\d+)$")
	public void oEstoqueSerá(int arg1) {

	}

}
