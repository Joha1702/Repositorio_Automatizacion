package co.com.saucedemo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoCart {
	
	public static final Target BTN_CHECKOUT = Target.the("Btn checkout").located(By.id("checkout"));
	public static final Target TXT_FIRST_NAME = Target.the("TXT first name").located(By.id("first-name"));
	public static final Target TXT_LAST_NAME = Target.the("TXT last name").located(By.id("last-name"));
	public static final Target TXT_POSTAL_CODE = Target.the("TXT postal code").located(By.id("postal-code"));
	public static final Target BTN_CONTINUE = Target.the("BTN continue").located(By.id("continue"));
	public static final Target BTN_FINISH = Target.the("BTN finish").located(By.id("finish"));
	public static final Target LBL_ORDER_COMPLETE = Target.the("LBL complete Order").located(By.className("complete-header"));
}
