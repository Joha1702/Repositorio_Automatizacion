package co.com.saucedemo.login.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.saucedemo.login.tasks.OpenTheBrowser;
import co.com.saucedemo.login.tasks.Write;
import co.com.saucedemo.login.userinterfaces.SaucedemoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SaucedemoLoginStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor leidy = Actor.named("leidy");
	
	private SaucedemoHomePage saucedemohomepage;
	
	@Before
	public void setUp() {
		leidy.can(BrowseTheWeb.with(herBrowser));
	}
	
	
	@Given("^that leidy want to login in saucedemo website$")
	public void thatLeidyWantToLoginInSaucedemoWebsite() throws Exception {
		leidy.wasAbleTo(OpenTheBrowser.on(saucedemohomepage));

		
	}


	@When("^she login to the page$")
	public void sheLoginToThePage() throws Exception {
		leidy.wasAbleTo(Write.Elements());
		
	}

	@Then("^she should see the url https://www\\.saucedemo\\.com/inventory\\.html in the screen$")
	public void sheShouldSeeTheUrlHttpsWwwSaucedemoComInventoryHtmlInTheScreen() throws Exception {
		leidy.should(GivenWhenThen.seeThat(actual, expectedMatchers));

	}

}
