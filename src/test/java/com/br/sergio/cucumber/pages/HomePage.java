package com.br.sergio.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {
//
//	@FindBy(name = "s")
//	WebElementFacade pesquisar;
	
	
	
	@FindBy(xpath = "//div[@role='alert']")
	WebElementFacade msgUsuarioLogado;
	
	@FindBy(linkText = "Contas")
	WebElementFacade menuConta;
	
	@FindBy(linkText = "Adicionar")
	WebElementFacade menuAdicionarConta;
	
	@FindBy(linkText = "Listar")
	WebElementFacade menuListarConta;

	@FindBy(xpath = "//*[@class='page-title']")
	WebElementFacade resultado;

//	public void pesquisar(String assunto) {
//	
////		elementoEstaPresente(pesquisar);
////		elementoEstaVisivel(pesquisar);
//		pesquisar.waitUntilPresent();
//		pesquisar.waitUntilVisible();
//		escrever(pesquisar, assunto);
//		Enter(pesquisar);
//	}

//	public String getResultado() {
//
//		return obterTexto(resultado);
//
//	}
	
	public String obterMensagemLoagado() {
		return obterTexto(msgUsuarioLogado);
	}
	
	public void selecionarMenuContas() {
		clicar(menuConta);
	}
	
	public void selecionarMenuAdicionarConta() {
		clicar(menuAdicionarConta);
	}
	
	public void selecionarMenuListarConta() {
		clicar(menuListarConta);
	}
	

}