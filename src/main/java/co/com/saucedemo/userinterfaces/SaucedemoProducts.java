package co.com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoProducts {
	
	public static final Target TARGET_PRODUCTS = Target.the("Target Products").locatedBy("//span[@class='title']");
	public static final Target BTN_PRODUCT_NAME = Target.the("Btn product name").locatedBy("//button[@id='add-to-cart-{0}']");
	public static final Target BTN_SHOPPING_CAR = Target.the("btn Shopping Car").locatedBy("//a[@class='shopping_cart_link']");

}
