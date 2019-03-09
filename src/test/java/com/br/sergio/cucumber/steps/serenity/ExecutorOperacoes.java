package com.br.sergio.cucumber.steps.serenity;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import com.br.sergio.cucumber.pages.BasePage;
import com.br.sergio.cucumber.pages.HomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(SerenityParameterizedRunner.class)



@UseTestDataFrom("test-data/simple-data.csv")

public class ExecutorOperacoes extends PageObject {

	HomePage home;
	private String usuario;
	private String senha;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Step
	public void queEuAcessoOSiteDoJp() {

	}

	@Qualifier
	public String  preencherOAssunto() {
	return getUsuario()+"teste";

	}

	@Test
	public void oSistemaExibeOsResultados() {
//		String resultado = home.getResultado();
//		assertEquals("Resultados da busca por: belt", resultado);

	}

}
