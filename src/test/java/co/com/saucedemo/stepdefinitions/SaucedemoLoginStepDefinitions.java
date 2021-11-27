package co.com.saucedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.saucedemo.questions.SeeProducts;
import co.com.saucedemo.tasks.Login;
import co.com.saucedemo.tasks.OpenTheBrowser;
import co.com.saucedemo.userinterfaces.SaucedemoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class SaucedemoLoginStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;

	private SaucedemoHomePage saucedemoHomePage;

	@Before()
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("leidy");
    }
	
	@Before
	public void setUp() {
		OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(herBrowser));
	}
	

	@Given("^that leidy want to access to saucedemo website$")
	public void thatLeidyWantToAccessToSaucedemoWebsite() {
		OnStage.theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on(saucedemoHomePage));
	}

	@When("^she login to the page$")
	public void sheLoginToThePage() {
		OnStage.theActorInTheSpotlight().wasAbleTo(Login.InPage());
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordPRODUCTSInTheScreen(String word) {
		OnStage.theActorInTheSpotlight().should(seeThat(SeeProducts.WordProduct(), equalTo(word)));
	}
	

}
