package testes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources/test/monetizacao.feature"},tags = {"@monetizacao"}, monochrome = true,
glue = {"stepdefs/geral"})

public class TestMonetizacao {

}

