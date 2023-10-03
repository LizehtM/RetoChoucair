package co.com.choucair.certificacion.PruebaChoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target BTN_LOG_IN = Target.the("log in").located(By.xpath("(//a[contains(text(),'Log In')])[1]"));
    public static final Target LABEL_USER = Target.the("User").located(By.id("username"));
    public static final Target LABEL_PASSWORD = Target.the("Password").located(By.id("password"));
    public static final Target BTN_SING_IN = Target.the("Password").located(By.id("kc-login"));
    public static final Target MESSAGE = Target.the("Message").located(By.xpath("//div[contains(text(),'First things first')]"));
    public static final Target MESSAGE_EMAIL = Target.the("Message email").located(By.xpath("//span[contains(text(),'Invalid username or password.')]"));

}

