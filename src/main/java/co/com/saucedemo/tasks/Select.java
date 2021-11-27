package co.com.saucedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.saucedemo.userinterfaces.SaucedemoCart;
import co.com.saucedemo.userinterfaces.SaucedemoProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Select implements Task{
	
	String product;
	
	public Select (String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println(product);
		actor.attemptsTo(Click.on(SaucedemoProducts.BTN_PRODUCT_NAME.of(product)),
				Click.on(SaucedemoProducts.BTN_SHOPPING_CAR),
				Click.on(SaucedemoCart.BTN_CHECKOUT),
				Enter.theValue("Leidy Johana").into(SaucedemoCart.TXT_FIRST_NAME),
				Enter.theValue("Moreno").into(SaucedemoCart.TXT_LAST_NAME),
				Enter.theValue("05001").into(SaucedemoCart.TXT_POSTAL_CODE),
				Click.on(SaucedemoCart.BTN_CONTINUE),
				Click.on(SaucedemoCart.BTN_FINISH));
	}

	public static Select  the(String product) {
		return instrumented(Select.class, product);
	}

}
