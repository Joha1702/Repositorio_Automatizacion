package co.com.saucedemo.questions;

import co.com.saucedemo.userinterfaces.SaucedemoCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class See implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(SaucedemoCart.LBL_ORDER_COMPLETE).viewedBy(actor).asString();
	}
	
	public static See Message() {
		return new See();
	}

}
