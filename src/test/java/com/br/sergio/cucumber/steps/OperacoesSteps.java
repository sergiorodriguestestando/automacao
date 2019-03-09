package com.br.sergio.cucumber.steps;

import com.br.sergio.cucumber.steps.serenity.ExecutorOperacoes;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

public class OperacoesSteps {
	
	
	
	@Steps
	ExecutorOperacoes exec;
	

	@Dado("^que eu acesso o site do jp$")
	public void queEuAcessoOSiteDoJp() throws Throwable {
		exec.queEuAcessoOSiteDoJp();
	}

	@Quando("^que eu desejar realizar uma consulta$")
	public void queEuDesejarRealizarUmaConsulta() throws Throwable {
//		exec.queEuDesejarRealizarUmaConsulta();
	}

	@E("^preencher o assunto$")
	public void preencherOAssunto() throws Throwable {
		exec.preencherOAssunto();
		
	}

	@Entao("^o sistema exibe os resultados$")
	public void oSistemaExibeOsResultados() throws Throwable {
		exec.oSistemaExibeOsResultados();
	}
}
