package co.com.saucedemo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/saucedemo_login.feature",
		glue = "co.com.saucedemo.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)
public class SaucedemoLoginRunner {

}
