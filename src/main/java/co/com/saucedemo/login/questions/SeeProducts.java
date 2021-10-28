package co.com.saucedemo.login.questions;

import co.com.saucedemo.login.userinterfaces.SaucedemoProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeeProducts implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

		return Text.of(SaucedemoProducts.TARGET_PRODUCTS).viewedBy(actor).asString();
	}

	public static SeeProducts WordProduct() {
		return new SeeProducts();
	}

}
