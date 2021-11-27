package co.com.saucedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import co.com.saucedemo.questions.See;
import co.com.saucedemo.tasks.Select;
import co.com.saucedemo.utils.Utils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class SaucedemoShoppingStepDefinitions {
	
	@When("^she make the process to buy the (.*)$")
	public void sheMakeTheProcessToBuyThe(String product){
		OnStage.theActorInTheSpotlight().wasAbleTo(Select.the(Utils.transform(product)));
	    
	}

	@Then("^she should see the message THANK FOR YOUR ORDER in the screen$")
	public void sheShouldSeeTheMessageTHANKFORYOURORDERInTheScreen() {
		OnStage.theActorInTheSpotlight().should(seeThat(See.Message(), equalTo("THANK YOU FOR YOUR ORDER")));
	    
	}

}
