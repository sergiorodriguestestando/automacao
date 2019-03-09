package com.br.sergio.cucumber.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprendendoCucumber {

	int numero = 0;
	Date entrega = new Date();

	@Dado("^que escrevi meu cenario$")
	public void queEscreviMeuCenario() {

	}

	@Quando("^excuta-lo$")
	public void excutaLo() {

	}

	@Entao("^minha especificação é executada com sucesso$")
	public void minhaEspecificaçãoÉExecutadaComSucesso() {

	}

	@Dado("^que o valor é (\\d+)$")
	public void queOValorÉ(int arg1) {
		numero = arg1;
		Assert.assertEquals(numero, 15);

	}

	@Quando("^incrementar (\\d+)$")
	public void incrementar(int arg1) {
		numero = numero + 3;

	}

	@Entao("^o valor é (\\d+)$")
	public void oValorÉ(int arg1) {
		Assert.assertEquals(numero, 18);

	}

	@Dado("^que o prazo da entrega é (\\d+)/(\\d+)/(\\d+)$")
	public void queOPrazoDaEntregaÉ(int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.DAY_OF_MONTH, dia);
		calendar.set(calendar.MONTH, mes - 1);
		calendar.set(calendar.YEAR, ano);
		entrega = calendar.getTime();

	}

	@Quando("^atrasar (\\d+) (dia|dias|mes|meses)$")
	public void atrasarDias(int tempoEntrega, String tempo) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(entrega);
		if (tempo.equals("dias")) {
			calendar.add(Calendar.DAY_OF_MONTH, tempoEntrega);
		}
		if (tempo.equals("meses")) {
			calendar.add(Calendar.MONTH, tempoEntrega);
		}

		entrega = calendar.getTime();

	}

	@Então("^a data de entrega será dia (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aDataDeEntregaSeráDia(String data) {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);

	}

	@Dado("^que o ticket (especial )?é A.(\\d+)$")
	public void queOTicketÉAF(String texto, int arg1) {

	}

	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemÉR$(int arg1, int arg2) {

	}

	@Dado("^que o nome do passageiro é \"(.*)\"$")
	public void queONomeDoPassageiroÉ(String arg1) {
		;
	}

	@Dado("^que o telefone do passageiro é (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiroÉ(int arg1, int arg2) {

	}

	@Quando("^criar os steps$")
	public void criarOsSteps() {

	}

	@Então("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() {

	}

}
