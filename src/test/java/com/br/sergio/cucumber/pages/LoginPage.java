package com.br.sergio.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

	@FindBy(id = "email")
	WebElementFacade usuario;

	@FindBy(id = "senha")
	WebElementFacade senha;
	
	@FindBy(xpath = "//button[text()='Entrar']")
	WebElementFacade btnEntrar;
	

	
	
	public void digitarUsuario(String texto) {
		escrever(usuario, texto);
	}
	

	public void digitarSenha(String texto) {
		escrever(senha, texto);
	}
	
	public void clicarBtbEntrar() {
		clicar(btnEntrar);
	
	}

	
}