package com.br.sergio.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( 
		        features = { "src/test/resources/features/Acoes/AprendendoCucumber.feature" }, 
		        glue = "com.br.sergio.cucumber.steps",
				plugin= "pretty", 
				tags = "~@ignore",
				monochrome = true,
				snippets= SnippetType.CAMELCASE
				
				  
)


public class RunnerTestSuite {
	
}
