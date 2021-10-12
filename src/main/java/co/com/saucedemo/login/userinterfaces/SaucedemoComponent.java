package co.com.saucedemo.login.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoComponent {
	
	public static final Target USERNAME_TEXTAREA = Target.the("Username text area").located(By.id("user-name"));
	public static final Target PASSWORD_TEXTAREA = Target.the("Password text area").located(By.id("password"));
	public static final Target LOGIN_BUTTON = Target.the("Login Button").located(By.id("login-button"));

}
