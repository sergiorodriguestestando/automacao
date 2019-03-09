package com.br.sergio.cucumber.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class BasePage extends PageObject {
	String url = "http://srbarriga.herokuapp.com/";

	public void acessar() {
		getDriver().get(url);

	}

	public void escrever(WebElement webElementFacade, String texto) {
		webElementFacade.sendKeys(texto);
	}

	public void Enter(WebElement webElementFacade) {
		webElementFacade.sendKeys(Keys.ENTER);
	}

	public void clicar(WebElement webElementFacade) {
		webElementFacade.click();
	}

	public void apagarCampo(WebElementFacade webElementFacade) {
		webElementFacade.clear();
	}

	public void selecionarCombo(WebElementFacade webbElement, String texto) {
		Select combo = new Select(webbElement);
		combo.selectByVisibleText(texto);

	}

	public String obterTexto(WebElementFacade webElement) {

		return webElement.getText();
	}
//------------------esperas--------------------------------------
	public boolean elementoEstaVisivel(WebElementFacade webElementFacade) {

		return webElementFacade.isVisible();

	}
	public WebElement elementoEstaNaPagina(WebElementFacade webElementFacade) {

		return webElementFacade.waitUntilVisible();

	}

	public boolean elementoEstaPresente(WebElementFacade webElementFacade) {

		return webElementFacade.isPresent();

	}

}
