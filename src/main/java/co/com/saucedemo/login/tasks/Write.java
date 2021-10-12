package co.com.saucedemo.login.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.saucedemo.login.userinterfaces.SaucedemoComponent;;

public class Write implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("standard_user").into(SaucedemoComponent.USERNAME_TEXTAREA),
				Enter.theValue("secret_sauce").into(SaucedemoComponent.PASSWORD_TEXTAREA),
				Click.on(SaucedemoComponent.LOGIN_BUTTON));
		
	}

	public static Write Elements() {
		
		return instrumented(Write.class);
	}

}
