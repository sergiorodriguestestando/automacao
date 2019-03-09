package com.br.sergio.cucumber.steps;

import org.junit.Assert;

import com.br.sergio.cucumber.pages.ContaPage;
import com.br.sergio.cucumber.pages.HomePage;
import com.br.sergio.cucumber.pages.LoginPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarContasSteps {

	LoginPage loginPage = new LoginPage();
	HomePage home = new HomePage();
	ContaPage contaPage = new ContaPage();

	@Dado("^que estou acessando a aplicação$")
	public void queEstouAcessandoAAplicação() {
		loginPage.acessar();

	}

	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String usuario) {
		loginPage.digitarUsuario(usuario);

	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String senha) {
		loginPage.digitarSenha(senha);

	}

	@Quando("^seleciono entrar$")
	public void selecionoEntrar() {
		loginPage.clicarBtbEntrar();

	}

	@Então("^visualizo a página inicial$")
	public void visualizoAPáginaInicial() {

		Assert.assertTrue(home.obterMensagemLoagado().contains("sergio!"));

	}

	@Quando("^seleciono Contas$")
	public void selecionoContas() {
		home.selecionarMenuContas();

	}

	@Quando("^seleciono Adicionar$")
	public void selecionoAdicionar() {
		home.selecionarMenuAdicionarConta();

	}

	@Quando("^informo a conta \"([^\"]*)\"$")
	public void informoAConta(String texto) {

		contaPage.digitarConta(texto);
	}

	@Quando("^seleciono Salvar$")
	public void selecionoSalvar() {
		contaPage.selecionarBtnSalvar();

	}

	@Então("^a conta é inserida com sucesso$")
	public void aContaÉInseridaComSucesso() {

		Assert.assertTrue(contaPage.obterMensagemContaCadastrado().contains("Conta adicionada com sucesso!"));

	}

	@Então("^sou notificar que o nome da conta é obrigatório$")
	public void souNotificarQueONomeDaContaÉObrigatório() {
		Assert.assertTrue(contaPage.obterMensagemContaVazia().contains("Informe o nome da conta"));

	}

	@Então("^sou notificado que já existe uma conta com esse nome$")
	public void souNotificadoQueJáExisteUmaContaComEsseNome() {
		Assert.assertTrue(contaPage.obterMensagemContaExistente().contains("Já existe uma conta com esse nome!"));

	}

	@Quando("^seleciono Listar$")
	public void selecionoListar() {
		home.selecionarMenuListarConta();

	}

	@Quando("^seleciono deleto uma conta$")
	public void selecionoDeletoUmaConta() {
		contaPage.selecionarBtnExluir();

	}

	@Então("^sou notificado que a conta foi excluida com sucesso$")
	public void souNotificadoQueAContaFoiExcluidaComSucesso() {
		Assert.assertTrue(contaPage.obterMensagemContaCadastrado().contains("Conta removida com sucesso!"));

	}

}
