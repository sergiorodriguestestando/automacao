package com.br.sergio.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class ContaPage extends BasePage {

	@FindBy(id = "nome")
	WebElementFacade campoConta;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElementFacade btnSalvar;

	@FindBy(xpath = "//div[@role='alert']")
	WebElementFacade msgUsuarioCadastrado;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElementFacade msgContaVazio;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElementFacade msgContaExistente;

	@FindBy(xpath = "//td[text()='Conta de Teste']/..//a[contains(@href,'remover')]")
	WebElementFacade btnExcluirConta;

	public void digitarConta(String conta) {
		escrever(campoConta, conta);
	}

	public void selecionarBtnSalvar() {
		clicar(btnSalvar);
	}

	public void selecionarBtnExluir() {
		clicar(btnExcluirConta);
	}

	public String obterMensagemContaCadastrado() {
		return obterTexto(msgUsuarioCadastrado);
	}

	public String obterMensagemContaVazia() {
		return obterTexto(msgContaVazio);
	}

	public String obterMensagemContaExistente() {
		return obterTexto(msgContaExistente);
	}

}