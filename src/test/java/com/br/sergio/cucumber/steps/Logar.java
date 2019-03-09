package com.br.sergio.cucumber.steps;

import com.br.sergio.cucumber.steps.serenity.ExecutorOperacoes;

import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

public class Logar {
	
	@Steps
	ExecutorOperacoes ex;

	@Quando("^informo o login$")
	public void informoOLogin() {
		ex = new ExecutorOperacoes();
		System.out.println(ex.getUsuario());
		System.out.println(ex.getSenha());

	}

	@Quando("^a psw$")
	public void aPsw() {
	}

}
