package co.com.saucedemo.login.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.saucedemo.login.userinterfaces.SaucedemoComponent;;

public class Login implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("standard_user").into(SaucedemoComponent.TXT_USERNAME),
				Enter.theValue("secret_sauce").into(SaucedemoComponent.TXT_PASSWORD),
				Click.on(SaucedemoComponent.BTN_lOGIN));
	}

	public static Login InPage() {
		return instrumented(Login.class);
	}

}
