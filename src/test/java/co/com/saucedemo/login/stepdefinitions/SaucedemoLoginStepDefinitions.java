package co.com.saucedemo.login.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;
import co.com.saucedemo.login.questions.SeeProducts;
import co.com.saucedemo.login.tasks.OpenTheBrowser;
import co.com.saucedemo.login.tasks.Login;
import co.com.saucedemo.login.userinterfaces.SaucedemoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SaucedemoLoginStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;

	private Actor leidy = Actor.named("leidy");

	private SaucedemoHomePage saucedemoHomePage;

	@Before
	public void setUp() {
		leidy.can(BrowseTheWeb.with(herBrowser));
	}

	@Given("^that leidy want to access to saucedemo website$")
	public void thatLeidyWantToAccessToSaucedemoWebsite() {
		leidy.wasAbleTo(OpenTheBrowser.on(saucedemoHomePage));
	}

	@When("^she login to the page$")
	public void sheLoginToThePage() {
		leidy.wasAbleTo(Login.InPage());
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordPRODUCTSInTheScreen(String word) {
		leidy.should(seeThat(SeeProducts.WordProduct(), equalTo(word)));
	}

}
