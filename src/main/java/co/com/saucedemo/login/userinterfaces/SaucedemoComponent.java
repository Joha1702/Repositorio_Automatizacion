package co.com.saucedemo.login.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoComponent {
	
	public static final Target TXT_USERNAME = Target.the("Username text area").located(By.id("user-name"));
	public static final Target TXT_PASSWORD = Target.the("Password text area").located(By.id("password"));
	public static final Target BTN_lOGIN = Target.the("Login Button").located(By.id("login-button"));

}
